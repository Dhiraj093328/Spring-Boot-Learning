<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>

<style>
table{
    border-collapse: collapse;
    width: 60%;
}

table, th, td{
    border: 1px solid black;
}

th, td{
    padding: 10px;
    text-align: center;
}

th{
    background-color: #f2f2f2;
}
</style>

</head>

<body>

<h1>Student List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
    </tr>

    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>