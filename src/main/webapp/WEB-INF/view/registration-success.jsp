<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Your Registration is successfull</h1>
<hr/>
<h2 >Details entered by you are : </h2>

User : ${registerdto.name}<br/>
User Name : ${registerdto.userName} <br/>
Password : ${registerdto.password} <br/>
Country :  ${registerdto.country} <br/>



Hobbies : 
 <c:forEach var="temp" items="${registerdto.hobbies}  ">
       
       ${temp}
      
</c:forEach>
<br/>
 
 
Gender :  ${registerdto.gender}

</body>
</html>