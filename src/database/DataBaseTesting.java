package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseTesting {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/gyan1","root","gyan@99");
		Statement sm=con.createStatement();
		ResultSet rs=sm.executeQuery("select * from login");
		while(rs.next())
		{
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
		}

	}

}
