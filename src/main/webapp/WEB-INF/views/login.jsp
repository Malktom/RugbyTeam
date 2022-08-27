<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="login">

    Login:
    <form:input path="login"/><br>

    Password:
    <form:input path="password"/>





    <input type="submit" value="submit">

</form:form>
</body>
</html>