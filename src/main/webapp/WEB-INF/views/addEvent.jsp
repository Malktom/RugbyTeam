<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="event">
    <form:hidden path="id"/>
    EvenType:
    <form:select itemValue="id" itemLabel="name" path="eventType" items="${eventTypes}"/>

    Name:
    <form:input path="name"/>
   Description:
    <form:input path="description"/>




    <input type="submit" value="submit">

</form:form>
</body>
</html>