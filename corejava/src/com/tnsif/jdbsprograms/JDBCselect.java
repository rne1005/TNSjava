package com.tnsif.jdbsprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCselect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
        // step-2 load and register the driver
		Class.forName("org.postgresql.Driver");
		System.out.println("load is over");
		
		// step -3 establish connection
		
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/teegala","postgres","1234");
		
		// step -4 create statement
		
		Statement st=con.createStatement();
		
		// step -5 execute quary
		
		String strselect="select sname, sbranch from student";
				
		System.out.println("The sql statement is "+strselect);
		
		// process the result
		
		ResultSet rs=st.executeQuery(strselect);
		System.out.println("The records are");
		int rowcount=0;
		while(rs.next()) {
			     String sname=rs.getString("sname");
			     String sbranch=rs.getString("sbranch");
			     
			     System.out.println(sname+" "+sbranch);
			     
			
		}
	}

}
