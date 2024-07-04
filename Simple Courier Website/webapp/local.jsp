<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style='background-color:rgba(255, 99, 71, 0.2);' >
<%
List<String> li=(List<String>)request.getAttribute("errors");
if(li!=null){
Iterator<String> itr=li.iterator();
%>
<ul>
<%
while(itr.hasNext()){%>
<li><%= itr.next() %></li>
<% } %>
</ul>
<% } %>
<form action="localCont" method="post">

<center>
      <h1 style='margin:50px;'>Local Delivery</h1>
      <h3>Same Day Delivery</h3>
      <p>Get your packages delivered on the same day.</p>
      </center>
      <center>
      <div style='margin:50px;'>
        ProductName:           <input type='text' name='productname' required><br><br><br>
        FromAddress:           <input type='address' name='fromaddress' required><br><br><br>
       <address>
        ToAddress:             <input type='address' name='toaddress' required><br><br><br>
        </address>
      </div>
      
       <button style='background-color: #04AA6D;'><h3>Ship Now</h3></button>
      </center></form>
</body>
</html>