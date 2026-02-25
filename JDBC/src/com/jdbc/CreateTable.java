package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");

            Statement stmt = con.createStatement();

            String sql = "CREATE TABLE project_details ("
                    + "Project_ID INT PRIMARY KEY, "
                    + "Project_Name VARCHAR(100), "
                    + "Client_Name VARCHAR(100), "
                    + "Start_Date DATE, "
                    + "End_Date DATE, "
                    + "Budget DOUBLE"
                    + ")";

            stmt.executeUpdate(sql);

            System.out.println("project_details table created successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
