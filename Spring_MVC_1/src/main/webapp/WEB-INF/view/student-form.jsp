<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" method="post" modelAttribute="student">
<label>First Name:</label><form:input path="firstName" /><br/>
<label>Last Name:</label><form:input path="lastName"/><br/>

<%-- <label>Email:</label><form:input path="email"/><br/> --%>
<label>Country:</label><form:select path="country">
<form:options items="${student.countryOptions}" />
</form:select>
<br><br>

<label>Favorite Language:</label>
Java <form:radiobutton path="favoriteLanguage" value="Java" />
C# <form:radiobutton path="favoriteLanguage" value="C#" />
PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />		
<br><br>

<label>Operating Systems</label>
Windows <form:checkbox path="operatingSystems" value="Windows" />
Linux <form:checkbox path="operatingSystems" value="Linux" />
<br><br>
<input type="submit" value="Submit" />
</form:form>
</body>
</html>