package com.view;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User1;
import com.model.UserDao1;

/**
 * Servlet implementation class SignUpController
 */
@WebServlet("/SignUpCont")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username=request.getParameter("username");
		String mailid=request.getParameter("mailid");
		String contact=request.getParameter("contact");
		//int cont =Integer.parseInt(Contact);
		String password=request.getParameter("password");
		//int psw =Integer.parseInt(Password);
		String address=request.getParameter("address");
		
		ArrayList<String>list1=new ArrayList<String>();
		if(username.length()==0)
			list1.add("Enter UserName");
		if(mailid.length()==0)
			list1.add("Enter MailId");
		if(contact.length()==0)
			list1.add("Enter Password");
		if(password.length()==0)
			list1.add("Enter Contact");
		if(address.length()==0)
			list1.add("Enter Address");
		
		if(!list1.isEmpty()) {
			request.setAttribute("errors",list1);
			RequestDispatcher rd=request.getRequestDispatcher("SignupServlet");
			rd.forward(request, response);
			
		}	
		User1 u1=new User1(username,mailid,contact,password,address);
		UserDao1 ud=new UserDao1();
		ud.storeData(u1);
		RequestDispatcher rd1=request.getRequestDispatcher("SuccessPage.html");
		rd1.forward(request, response);
		
	}
	

	}

