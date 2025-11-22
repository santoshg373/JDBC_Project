package vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Santu@123");
			PreparedStatement st=con.prepareStatement("update employee set name = ? where id=?");
			st.setString(1,"Santosh");
			st.setInt(2, 101);
			int rowsUpdate=st.executeUpdate();
			System.out.println("No of rows updated : "+rowsUpdate);
			st.close();
			con.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
