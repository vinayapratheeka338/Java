package com.jdbc;
import java.sql.*;

public class JDBCEx1 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM emp_details");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("Employee_ID") + " " +
                    rs.getString("FirstName") + " " +
                    rs.getString("LastName") + " " +
                    rs.getString("Gender") + " " +
                    rs.getInt("Age") + " " +
                    rs.getString("Address") + " " +
                    rs.getString("Mobile_Number") + " " +
                    rs.getString("Dept") + " " +
                    rs.getDouble("Salary")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
