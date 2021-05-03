<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.errors{
color: red;
position: fixed;
text-align: left;
margin-left: 30px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1 align="center">Love Calculator</h1>
<hr/>
<form:form action="process-homepage" method="get" modelAttribute="userInfo">
<div align="center">
<p>
<label for="yn"> Your Name : </label>
<form:input id ="yn" path="userName" />
<form:errors path="userName" cssClass="errors" />
</p>
<p>
<label for="cn"> Crush Name : </label>
<form:input id ="cn" path="crushName"/>
<form:errors path="crushName" cssClass="errors" />
</p>

<p>
<form:checkbox path="termAndConsition" id="check" /> 
<label>I am agrre</label>
<form:errors path="termAndConsition" cssClass="errors" />
</p>

<input type="submit" value="calculate" >
</div>

</form:form>
</body>
</html>