<%@page import="com.example.model.ToDo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ToDo todo=(ToDo)request.getAttribute("todo");
out.println(todo.getId()+" , "+todo.getName()+" , "+todo.getCompletedBy());
%>
</body>
</html>