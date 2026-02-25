package com.jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.CallableStatement;
public class DeleteStoredP {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wiprodb","root","root");
			CallableStatement cs = con.prepareCall("{call deleteEmployee(3)}");
			int rows = cs.executeUpdate();
			System.out.println(rows + " row deleted");

            cs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
