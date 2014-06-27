package com.example.clinicdashboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DataAccess {
	private final String userName = "DevDBUser";
	private final String password = "develop";
	
	// MS JDBC 4.0 driver
	// private final String connectionString = "jdbc:sqlserver://10.20.101.12;databaseName=TEST";
	
	// jTDS JDBC 3.0 driver
	private final String connectionString = "jdbc:jtds:sqlserver://10.20.101.12;databaseName=TEST";
	
	private String practice = "TEST";
	private String clinic = "TEST";	
	
	public String getSelectedPractice() { return this.practice; }
	public void setSelectedPractice(String newPractice) { this.practice = newPractice; } 
	public String getSelectedClinic() { return this.clinic; }
	public void setSelectedClinic(String newClinic) { this.clinic = newClinic; }
	
	private Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Connection c = null;
		Properties p = new Properties();
		p.put("user", this.userName);
		p.put("password", this.password);
		
		// MS JDBC 4.0 driver
		// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		
		
		// jTDS JDBC 3.0 driver
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		
		try
		{
		c = DriverManager.getConnection(connectionString, p);
		}
		catch (Exception e)
		{
			e.printStackTrace();			
		}
		
		return c;
	}
	
	public String[] getClinicsForPractice() throws SQLException, ClassNotFoundException
	{
		return getClinicsForPractice(this.practice);
	}
	
	public String[] getClinicsForPractice(String practice) throws SQLException, ClassNotFoundException
	{
		final String GET_CLINICS_QUERY = "SELECT Clinic_Name FROM Common.dbo.Clinic WHERE Practice = @Practice ORDER BY Clinic_Name";
			
		Connection c = getConnection();
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery(GET_CLINICS_QUERY.replace("@Practice", "'" + practice + "'"));
		List<String> clinics = new ArrayList<>();
		
		while (rs.next())		
			clinics.add(rs.getString("Clinic_Name"));		
		
		String[] clinicArray = new String[clinics.size()];
		
		for (int i = 0; i < clinics.size(); i++)
			clinicArray[i] = clinics.get(i);
		
		return clinicArray;
	}
	
	public int getTotalVisitsForClinic() throws ClassNotFoundException, SQLException
	{
		return getTotalVisitsForClinic(this.practice, this.clinic);
	}
	
	public int getTotalVisitsForClinic(String practice, String clinic) throws ClassNotFoundException, SQLException
	{
		final String GET_VISITS_QUERY = "SELECT ISNULL(COUNT(DISTINCT Log_Num), 0) AS Total FROM LogDetail WHERE Practice = @Practice AND Clinic = @Clinic AND Svc_Date = '6/27/2014'";
		
		Connection c = getConnection();
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery(GET_VISITS_QUERY.replace("@Practice", "'" + practice + "'").replace("@Clinic", "'" + clinic + "'"));		
		rs.next();
		return rs.getInt("Total");
	}
	
	public int getPatientsInClinic() throws ClassNotFoundException, SQLException
	{
		return getPatientsInClinic(this.practice, this.clinic);		
	}
	
	public int getPatientsInClinic(String practice, String clinic) throws ClassNotFoundException, SQLException
	{
		final String GET_VISITS_QUERY = "SELECT ISNULL(COUNT(DISTINCT Pat_Num), 0) AS Total FROM LogDetail WHERE Practice = @Practice AND Clinic = @Clinic AND Svc_Date = '6/27/2014' AND Time_Out = 0";
		
		Connection c = getConnection();
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery(GET_VISITS_QUERY.replace("@Practice", "'" + practice + "'").replace("@Clinic", "'" + clinic + "'"));		
		rs.next();
		return rs.getInt("Total");		
	}
}
