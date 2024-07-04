package com.view;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.model.UserDao;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginCont")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//String password= Integer.parseInt(password);
		ArrayList<String> list=new ArrayList<String>();
		if(username.length()==0)
			list.add("Enter UserName");
		if(password.length()==0)
			list.add("Enter Password");
		

	if(!list.isEmpty()) {
		request.setAttribute("errors",list);
		RequestDispatcher rd=request.getRequestDispatcher("LoginServlet");
		rd.forward(request, response);
		return;
	}
	
	User u=new User(username,password);
	UserDao ud=new UserDao();
	ud.storeData(u);
	RequestDispatcher rd1=request.getRequestDispatcher("SuccessPage.html");
	rd1.forward(request, response);
	
	}
}