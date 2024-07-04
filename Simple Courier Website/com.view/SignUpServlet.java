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

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		@SuppressWarnings("unchecked")
		ArrayList<String> list1=(ArrayList<String>)request.getAttribute("errors");
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
		out.println("h2 {");
        out.println("  font-size: 40px; /* Font size for the heading */");
        out.println("}");
        
        out.println("form div {");
        out.println("  padding: 25px;");
        //out.println("  color: lightgrey;");
        out.println("  font-size: 2rem;");
        out.println("}");
        
        out.println("input[type='text'], input[type='password'], input[type='textarea'] {");
        out.println("  width: 200px; /* Adjust the width of input fields */");
        out.println("  height: 25px; /* Adjust the height of input fields */");
        out.println("  font-size: 16px; /* Font size for input text */");
        out.println("}");
        
        out.println("textarea {");
        out.println("  height: 200px; /* Adjust the height of the textarea */");
        out.println("}");
        
        out.println("input[type='submit'] {");
        out.println("  font-size: 20px; /* Font size for submit button */");
        out.println("  padding: 10px 10px; /* Padding for submit button */");
        out.println("}");
		
		out.println("</style>");
		out.println("</head>");
		 out.println("<body>");
		 if(list1!=null) {
				Iterator <String> itr= list1.iterator();
				out.println("<ul>");
				while(itr.hasNext()) {
					out.println("<li>"+itr.next()+"</li>");
				}
				out.println("</ul>");
			}
		 out.println("<center>");
		 out.println("<h2 style='padding: 20px; color:lightgray;'><i>SIGNUP HERE</i></h2>");
		 out.println("<form action=' SignUpCont ' method='post'>");
		 out.println("<div >");
		 out.println("Username:  <input type='text' name='username' required> <br><br> ");
		 out.println("MailId:    <input type='text' name='mailid' required> <br><br>");
		 out.println("Password:  <input type='text' name='password' required> <br><br>");
		 out.println("Contact:   <input type='text' name='contact' required> <br><br>");
		 out.println("Address:   <input type='text area' name='address' required><br><br> ");
		 out.println("<input type='Submit' value='Submit'> <br><br>");
		 out.println("</div></form></center> </body>");
		 out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}


