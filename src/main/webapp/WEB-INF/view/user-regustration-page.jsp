<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Please register here  </h1>
<hr>
<div align="center">
<form:form action="registration-success" modelAttribute="userregistration" method="get">
<label>User :</label>
<form:input path="name" />
<br/><br/>
<label>Username :</label>
<form:input path="userName" />
<br/><br/>
<label>Password :</label>
<form:password path="password" />
<br/><br/>
<label>Country Name  :</label>
<form:select path="country">
<form:option label="India" value="Ind"/>
<form:option label="United States" value="Usa"/>
<form:option label="Pakistan" value="Pak"/>
<form:option label="Srilanka" value="Sl"/>
</form:select>
<br/><br/>
<label>Hobbies :</label>
Cricket : <form:checkbox path="hobbies" value="cricket" /> 
Reading : <form:checkbox path="hobbies" value="reading" /> 
Travel : <form:checkbox path="hobbies" value="travel" /> 
Programming : <form:checkbox path="hobbies" value="programming" /> 

<br/><br/>
<label>Gender :</label>
Male :<form:radiobutton path="gender" value="male" />
Female :<form:radiobutton path="gender"  value="female"/>
<br/>
<input type="submit" value="register" />

</form:form>
</div>

</body>
</html>