package com.cont;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.model.UserDao;
import com.model.local;
import com.model.localDao;

@WebServlet("/localCont")
public class localController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String ProductName=request.getParameter("productname");
	String FromAddress=request.getParameter("fromaddress");
	String ToAddress=request.getParameter("toaddress");
	
	
	local u=new local(ProductName,FromAddress,ToAddress);
	localDao ud=new localDao();
	ud.storeData(u);
RequestDispatcher rd1=request.getRequestDispatcher("ShippingSuccess.html");
rd1.forward(request, response);

	}
}

