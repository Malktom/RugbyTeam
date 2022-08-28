<%--
  Created by IntelliJ IDEA.
  User: tomasz
  Date: 30.07.2022
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<jsp:include page="navi.jsp"/>
<div class="btn-group">

    <button onclick="location.href='/app/events/addType'" type="button">Add New Event Type</button><br><br>
</div>
<table>
    <tr>
        <th>name</th>
        <th>description</th>
        <th>number of events</th>


    </tr>
    <c:forEach items="${eventTypes}" var="event">
        <tr>
            <div class="btn-group">
                <td><button onclick="location.href='/app/events/${event.name}'"type="button"> ${event.name}</button></td>
            </div>
            <td>${event.description}</td>





        </tr>

    </c:forEach>

</table>
</body>
</html>
