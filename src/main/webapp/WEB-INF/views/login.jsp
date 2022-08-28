<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="./css/style.css">
</head>


<body>

<div id="container">
    <div id="navbar">
        <a href="/register">Register</a>
        <a href="#news">News</a>
        <a href="#contact">Contact</a>
    </div>
    <form:form method="post" modelAttribute="user">

        Login:
        <form:input path="login"/><br>

        Password:
        <form:input path="password"/>


        <input type="submit" value="submit">

    </form:form>
</div>
</body>
</html>