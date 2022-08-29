<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<jsp:include page="header.jsp"/>--%>
<link rel="stylesheet" href="/css/style.css">
<body>

<jsp:include page="navi.jsp"/>
<div class="btn-group">
    <button onclick="location.href='/app/events/add'" type="button">Add New Event</button>
    <button onclick="location.href='/app/events/addType'" type="button">Add New Event Type</button><br><br>
</div>

<div>
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

                    <div class="btn-group">
                        <button onclick="location.href='/app/events/delete/${event.id}'" type="button">delete</button>
                        <button onclick="location.href='/app/events/edit/${event.id}'" type="button">edit</button>


                    </div>
                        <%--                <a href="<c:url value="/category/edit/${category.id}"/>">edit</a>--%>
                </td>
            </tr>

        </c:forEach>

    </table>

</div>
</body>
</html>
