<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="player">
    <form:hidden path="id"/>
    Name:
    <form:input path="name"/>
    Surname:
    <form:input path="surname"/>
    Weight:
    <form:input path="weight"/>
    Height:
    <form:input path="height"/>
    Position:
    <form:select path="position" items="${positions}"/>
    Ready to play?:
    <form:checkbox path="readyToPlay"/>



       <input type="submit" value="submit">

</form:form>
</body>
</html>