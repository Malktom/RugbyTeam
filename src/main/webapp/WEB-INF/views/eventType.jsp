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
    <jsp:include page="formStyle.jsp"/>
</head>
<body>
<jsp:include page="navi.jsp"/>
<table>
    <tr>
        <th>name</th>
        <th>description</th>


    </tr>
    <c:forEach items="${eventTypes}" var="event">
        <tr>

            <td><a href="<c:url value="/app/events/${event.name}"/>"> ${event.name}</a></td>
            <td>${event.description}</td>


        </tr>

    </c:forEach>

</table>
</body>
</html>
