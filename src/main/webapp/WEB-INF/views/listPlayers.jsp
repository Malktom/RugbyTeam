<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="formStyle.jsp"/>
</head>

<body>

<jsp:include page="navi.jsp"/>
<a href="<c:url value="/app/players/add"/>">Add new Player</a>
<%--<a href="<c:url value="/article/list"/>">article list</a>--%>
<%--<a href="<c:url value="/author/list"/>">author list</a>--%>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>surname</th>
        <th>weight</th>
        <th>height</th>
        <th>position</th>
        <th>readyToPlay</th>
        <th>medicalCheckDate</th>
        <th>presenceStatistic</th>

    </tr>
    <c:forEach items="${players}" var="player">
        <tr>
            <td>${player.id}</td>
            <td>${player.name}</td>
            <td>${player.surname}</td>
            <td>${player.weight}</td>
            <td>${player.height}</td>
            <td>${player.position}</td>
            <td>${player.readyToPlay}</td>
            <td>${player.medicalCheckDate}</td>
            <td>${player.presenceStatistic}</td>

            <td>
                <a href="<c:url value="/app/players/delete/${player.id}"/>">delete</a>
<%--                <a href="<c:url value="/category/edit/${category.id}"/>">edit</a>--%>
            </td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
