<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- Student ID: ${student.id}<br/>
Student First Name: ${student.firstName}<br/>
Student Last Name: ${student.lastName}</br>
Student Email: ${student.email}<br/> --%>
The student is confirmed: ${student.firstName} ${student.lastName}
<br><br>

Country: ${student.country}
<br><br>

Favorite Language: ${student.favoriteLanguage}
<br><br>

Operating System: ${student.operatingSystems}
</body>
</html>