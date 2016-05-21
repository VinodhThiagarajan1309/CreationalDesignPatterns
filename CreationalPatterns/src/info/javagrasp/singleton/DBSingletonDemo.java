package info.javagrasp.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSingletonDemo {

	public static void main(String[] args) {
		
		long timeBefore;
		long timeAfter;
		// TODO Auto-generated method stub
		DBSingleton instance = DBSingleton.getInstance();
		
		timeBefore = System.currentTimeMillis();
		Connection conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		
		System.out.println(timeAfter - timeBefore);
		
		Statement sta;
		try{
			sta = conn.createStatement();
			int count = sta.executeUpdate("CREATE TABLE ADDRESS (ID INT , STREETNAME VARCHAR(20) ,CITY VARCHAR(20))");
			System.out.println("Table created !");
			sta.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		timeBefore = System.currentTimeMillis();
		 conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		
		System.out.println(timeAfter - timeBefore);
		
	}

}
