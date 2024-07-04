package com.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	public UserDao() {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/courier","root","root");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public ResultSet retrieveUser() {
		String sql="select * from logindetails";
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
		}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return rs;
}
public void storeData(User u) {
	String sql="insert into logindetails(Username, Password) value(?, ?)";

try {
	pst=con.prepareStatement(sql);
	pst.setString(1,u.getUsername());
	pst.setString(2,u.getPassword());
	pst.executeUpdate();
	
}catch(SQLException e) {
	e.printStackTrace();
}
}
}

