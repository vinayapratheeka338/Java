package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DBCreation {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			Statement stmt = con.createStatement();
            stmt.executeUpdate("CREATE DATABASE training_db");
            stmt.executeUpdate("USE training_db");
            String tableSQL = "CREATE TABLE student_projects ("
                    + "Project_ID INT PRIMARY KEY, "
                    + "Student_Name VARCHAR(50), "
                    + "Project_Title VARCHAR(100), "
                    + "Guide_Name VARCHAR(50), "
                    + "Submission_Date DATE, "
                    + "Marks INT"
                    + ")";

            stmt.executeUpdate(tableSQL);

            String insertSQL = "INSERT INTO student_projects VALUES "
                    + "(1,'Vinaya','Online Exam System','Ravi','2024-06-01',85),"
                    + "(2,'Rahul','Library Management','Suma','2024-06-05',78),"
                    + "(3,'Anita','Employee Tracker','Kiran','2024-06-10',90)";

            stmt.executeUpdate(insertSQL);
            stmt.executeUpdate(
                "UPDATE student_projects SET Marks=95 WHERE Project_ID=3"
            );

            System.out.println("training_db created and all operations completed!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
		