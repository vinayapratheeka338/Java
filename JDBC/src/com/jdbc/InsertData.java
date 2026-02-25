package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");

            Statement stmt = con.createStatement();

            String sql = "INSERT INTO project_details VALUES " +
                    "(1,'Payroll System','Wipro','2024-01-01','2024-06-01',500000)," +
                    "(2,'E-Commerce App','Amazon','2024-03-15','2024-10-30',1200000)," +
                    "(3,'Bank Portal','Wipro','2024-02-01','2024-08-15',800000)";

            int rows = stmt.executeUpdate(sql);

            System.out.println(rows + " records inserted successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
