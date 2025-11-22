package vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Santu@123");
			PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?)");
			
			st.setInt(1,101);
			st.setString(2, "teja");
			st.setString(3, "Java");
			
			int noOfRows=st.executeUpdate();
			System.out.println("No of rows inserted"+noOfRows);
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
