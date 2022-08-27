<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<c:url value="/register"/>">Register New User</a>
<form:form method="post" modelAttribute="user" >

    Login:
    <form:input path="login"/><br>

    Password:
    <form:input path="password"/>


    <input type="submit" value="submit">

</form:form>
</body>
</html>