package com.jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.CallableStatement;
public class InsertStoredP {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wiprodb","root","root");
			CallableStatement cs = con.prepareCall("{call insertEmployee(4,'Anita',300000)}");
			int rows = cs.executeUpdate();
			System.out.println(rows + " row inserted");

            cs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
			
