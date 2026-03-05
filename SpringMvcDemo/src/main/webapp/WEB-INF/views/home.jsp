<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Spring MVC Application</title>
</head>
<body>
<%
String s=(String)request.getAttribute("Name");
Integer i=(Integer)request.getAttribute("id");
Integer sal=(Integer)request.getAttribute("Salary");
out.println("ID:"+i+ "Name:"+s+"Salary:"+sal);
%>
</body>
</html>