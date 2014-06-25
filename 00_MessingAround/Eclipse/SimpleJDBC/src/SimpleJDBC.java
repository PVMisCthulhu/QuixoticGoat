import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJDBC 
{
	// This application will select all the practice names from the DevDB01 database
	// You need to have JDBC MSSQL 4.0 driver installed for this to work
	// You will need to put sqlijdbc4.jar in your classpath
	public static void main(String[] args) 
	{
		final String QUERY = "SELECT Practice FROM Practice ORDER BY Practice";
		
		ConnectionManager cm = new ConnectionManager();		
		
		try 
		{
			Connection c = cm.getConnection();
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(QUERY);
			
			while (rs.next())
			{
				System.out.println(rs.getString("Practice"));
			}
		} 
		catch (SQLException e) 
		{			
			e.printStackTrace();
		}
	}	
}

