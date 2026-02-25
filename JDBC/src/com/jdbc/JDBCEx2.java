package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class JDBCEx2 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp_details");
			System.out.printf(
					"%-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s%n",
					"EmpID","FirstName","LastName","Gender","Age","Address","Mobile","Dept","Salary"
					);

			System.out.println("-------------------------------------------------------------------------------");
			while(rs.next()) 
			{
				System.out.printf("%-12d %-12s %-12s %-12s %-12d %-12s %-12s %-12s %-12.2f%n",
				        rs.getInt("Employee_ID"),
				        rs.getString("FirstName"),
				        rs.getString("LastName"),
				        rs.getString("Gender"),
				        rs.getInt("Age"),
				        rs.getString("Address"),
				        rs.getString("Mobile_Number"),
				        rs.getString("Dept"),
				        rs.getDouble("Salary")
				    );

			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
