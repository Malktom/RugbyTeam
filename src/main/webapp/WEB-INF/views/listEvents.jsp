<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Title</title>
</head>
<style>
    table {
        border-collapse: collapse;
        /*width: 100%;*/
    }
    th, td {
        text-align: left;
        padding: 8px;
    }
    tr:nth-child(even){background-color: #f2f2f2}
    th {
        background-color: #04AA6D;
        color: white;
    }
</style>
<body>
<a href="<c:url value="/app/events/add"/>">Add new Event</a>
<a href="<c:url value="/app/players/list"/>">Players</a>
<a href="<c:url value="/app/users/list"/>">Users</a>
<%--<a href="<c:url value="/article/list"/>">article list</a>--%>
<%--<a href="<c:url value="/author/list"/>">author list</a>--%>
<table>
    <tr>
        <th>id</th>
        <th>type</th>
        <th>name</th>
        <th>description</th>
        <th>players</th>


    </tr>
    <c:forEach items="${events}" var="event">
        <tr>
            <td>${event.id}</td>
            <td>${event.eventType.name}</td>
            <td>${event.name}</td>
            <td>${event.description}</td>
            <td>${event.players}</td>

            <td>
                <a href="<c:url value="/app/events/delete/${event.id}"/>">delete</a>
<%--                <a href="<c:url value="/category/edit/${category.id}"/>">edit</a>--%>
            </td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
