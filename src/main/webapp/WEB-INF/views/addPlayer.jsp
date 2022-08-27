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
<form:form method="post" modelAttribute="player">
    <form:hidden path="id"/>
    Name:
    <form:input path="name"/>
    <form:errors path="name" cssClass="error-class"/>
    Surname:
    <form:input path="surname"/>
    <form:errors path="surname" cssClass="error-class"/>
    Weight:
    <form:input path="weight"/>
    Height:
    <form:input path="height"/>
    Position:
    <form:select path="position" items="${positions}"/>
    <form:errors path="position" cssClass="error-class"/>
    Ready to play?:
    <form:checkbox path="readyToPlay"/>



       <input type="submit" value="submit">

</form:form>
</body>
</html>