<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Express Delivery</title>
</head>
<body style='background-color:rgba(255, 99, 71, 0.2);' >
<form action="expresscont" method="post">

<center>
      <h1 style='margin:50px;'>Local Delivery</h1>
      
      <h3>Overnight Shipping</h3>
      <p>Reliable overnight shipping for urgent deliveries.</p></p>
      </center>
      <center>
      <div style='margin:50px;'>
        Product Name:           <input type='text' name='productname' required><br><br><br>
        From Address:           <input type='address' name='fromaddress' required><br><br><br>
       <address>
        TO Address:             <input type='address' name='to address' required><br><br><br>
        </address>
      </div>
      
       <button style='background-color: #04AA6D;'><h3>Ship Now</h3></button>
      </center>
</body>
</html>