package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class localDao {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	
	public localDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/courier","root","root");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	public ResultSet retrievelocal() {
		String sql="select * from delivery details";
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
public void storeData(local u) {
	String sql="insert into deliverydetails(ProductName, FromAddress, ToAddress) value(?, ?, ?)";

	try {
		pst=con.prepareStatement(sql);
		pst.setString(1,u.getProductName());
		pst.setString(2,u.getToAddress());
		pst.setString(3,u.getFromAddress());
		pst.executeUpdate();
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
	}
	
