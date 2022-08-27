<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Title</title>
</head>
<jsp:include page="formStyle.jsp"/>
<body>

<jsp:include page="navi.jsp"/>
<a href="<c:url value="/app/events/add"/>">Add new Event</a>
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
