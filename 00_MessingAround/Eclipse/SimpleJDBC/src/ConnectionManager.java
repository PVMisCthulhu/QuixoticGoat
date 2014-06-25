import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

		class ConnectionManager
		{
			private final String userName = "DevDBUser";
			private final String password = "develop";
			private final String connectString = "jdbc:sqlserver://10.20.101.12;databaseName=Common";
			
			public Connection getConnection() throws SQLException
			{
				Connection connection = null;
				Properties connectionProps = new Properties();
				connectionProps.put("user", this.userName);
				connectionProps.put("password", this.password);
				
				// This requires the JDBC driver for MSSQL to work
				connection = DriverManager.getConnection(connectString, connectionProps);
				
				return connection;
			}	
		}