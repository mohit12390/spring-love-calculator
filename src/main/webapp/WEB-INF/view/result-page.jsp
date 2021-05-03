<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Love Calculator</h1>

<h2>Hi  ${userInfo.userName} </h2>
<hr/>
<h2>The Love Calculator Preditcs : </h2>
<br/>
${userInfo.userName} and  ${userInfo.crushName} 
<br/>
FRIENDS

<br/><br/>
<a href="/spring-love-calculator/sendemail">Send result to your  email : </a>

</body>
</html>