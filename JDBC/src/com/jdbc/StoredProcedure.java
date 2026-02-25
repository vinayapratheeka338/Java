package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.CallableStatement;

public class StoredProcedure {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");
            CallableStatement cs = con.prepareCall("{call GetAllEmployees()}");
            ResultSet rs = cs.executeQuery();

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
            cs.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
