<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<jsp:include page="formStyle.jsp"/>
<body>
<a href="<c:url value="/register"/>">Register New User</a>
<div id="navbar">
    <a href="/register">Register</a>
    <a href="#news">News</a>
    <a href="#contact">Contact</a>
</div>
<form:form method="post" modelAttribute="user" >

    Login:
    <form:input path="login"/><br>

    Password:
    <form:input path="password"/>


    <input type="submit" value="submit">

</form:form>
</body>
</html>