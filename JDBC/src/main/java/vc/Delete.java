package vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Santu@123");
			PreparedStatement pst=com.prepareStatement("DELETE FROM employee WHERE id=?");
			pst.setInt(1, 101);
			int rowseffected=pst.executeUpdate();
			System.out.println(rowseffected);
			pst.close();
			com.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
