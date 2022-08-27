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
<form:form method="post" modelAttribute="user" >

    <form:hidden path="id"/>
    Login:
    <form:input path="login"/>
    Email:
    <form:input path="email"/>
    Password:
    <form:input path="password"/>
    Role:
    <form:input path="role"/>



    <input type="submit" value="submit">

</form:form>
</body>
</html>