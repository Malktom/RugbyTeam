<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="formStyle.jsp"/>
</head>

<body>

<jsp:include page="navi.jsp"/>
<div class="btn-group">
    <button onclick="location.href='/app/players/add'" type="button">Add New Player</button>
</div>
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
                <div class="btn-group">
                    <button onclick="location.href='/app/players/delete/${player.id}'" type="button">delete</button>
                    <button onclick="location.href='/app/players/edit/${player.id}'" type="button">edit</button>
                </div>

<%--                <a href="<c:url value="/category/edit/${category.id}"/>">edit</a>--%>
            </td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
