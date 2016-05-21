package info.javagrasp.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {

	//Eagerly Loaded
	//private static DBSingleton instance = new DBSingleton();
	
	//Lazy Loaded
	private static DBSingleton instance = null;
	
	private static Connection conn = null;
	
	private DBSingleton(){
		try{
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public static DBSingleton getInstance(){
		//Lazy Loading
		if(null == instance){
			//thread safe
			synchronized (DBSingleton.class) {
				if(null == instance){
					instance = new DBSingleton();
				}
			}
		}
		return instance;
	}
	
	public Connection getConnection(){
		//Lazy Loading
				if(null == conn){
					//thread safe
					synchronized (DBSingleton.class) {
						if(null == conn){
							try{
								String dbURL = "jdbc:derby:memory:codejava/webdb;create=true";
								conn = DriverManager.getConnection(dbURL);
							}catch(SQLException e){
								e.printStackTrace();
							}
						}
					}
				}
				return conn;
			}
	
}
