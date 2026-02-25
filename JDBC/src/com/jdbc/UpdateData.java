package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");

            Statement stmt = con.createStatement();

            String sql = "UPDATE project_details " +
                         "SET Client_Name = 'IBM' " +
                         "WHERE Project_ID = 3";

            int rows = stmt.executeUpdate(sql);

            System.out.println(rows + " record updated successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

