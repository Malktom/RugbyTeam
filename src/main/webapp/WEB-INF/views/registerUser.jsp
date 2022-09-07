<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/css/style.css">
</head>

<body>
<form:form method="post" modelAttribute="user" >

    <form:hidden path="id"/>
    Login:
    <form:input path="login"/>
    <form:errors path="login" cssClass="error-class"/>
    Email:
    <form:input path="email"/>
    <form:errors path="email" cssClass="error-class"/>
    Password:
    <form:input path="password"/>
    <form:errors path="password" cssClass="error-class"/>
    Role:
    <form:input path="role"/>
    <form:errors path="role" cssClass="error-class"/>



    <input type="submit" value="submit">
    <img src="image/wasp.png" width="120" height="100" border="0" /><br>
</form:form>
</body>
</html>