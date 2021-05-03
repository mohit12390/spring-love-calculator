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

<h1>HI   ${userInfo.userName} </h1>

<h2>Send Result to email : </h2>
<form:form action="process-email" method="get" modelAttribute="emaildto">
<div align="center">
<p>
<label for="email"> Your Email ID  : </label>
<form:input id ="email" path="email" />
</p>

<input type="submit" value="sendEmail" >
</div>

</form:form>

</body>
</html>