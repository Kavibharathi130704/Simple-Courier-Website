package com.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

			@SuppressWarnings("unchecked")
			ArrayList<String> list=(ArrayList<String>)request.getAttribute("errors");
			 PrintWriter out=response.getWriter();
			 response.setContentType("text/html");
			 out.println("<html>");
			 out.println("<head>");
				out.println("<style>");
				out.println("body{");
				out.println("background-image:url('image/homedeliver.png');");
				out.println("background-size:cover;");
		        out.println("  font-size: 20px; /* Default font size for the body */");

				out.println("}");
				out.println("</style>");
				 out.println("</head>");
			 out.println("<body>");
			 
			 if(list!=null) {
					Iterator <String> itr=list.iterator();
					out.println("<ul>");
					while(itr.hasNext()) {
						out.println("<li>"+itr.next()+"</li>");
					}
					out.println("</ul>");
				}
			 out.println("<center>");
			 out.println("<h2 style='padding: 20px;color:lightgray;'><i>LOGIN HERE<i></h2>");
			 out.println("<form action='LoginCont' method='post'>");
			 out.println("<div style='padding: 20px; font-size:1.5 rem;'>");
			 out.println("Username:  <input type='text' name='username' required> <br><br>");
			 out.println("Password:  <input type='text' name='password' required> <br><br>");
			 out.println("<input type='submit' value='submit'> <br><br>");
			 out.println("</div>");	
			 out.println("</form>");	
			 out.println("</center>");
			 out.println("</body>");
			 out.println("</html>");
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

	
