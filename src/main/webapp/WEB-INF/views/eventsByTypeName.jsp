<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="header.jsp"/>

<body>
<jsp:include page="navi.jsp"/>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>description</th>
        <th>players selected</th>



    </tr>
    <c:forEach items="${eventByTypeName}" var="event">
        <tr>
            <td>${event.id}</td>
            <td>${event.name}</td>
            <td>${event.description}</td>
            <td>${event.players}</td>



            <td>
<%--                <a href="<c:url value="/article/delete/${article.id}"/>">delete</a>--%>
<%--                <a href="<c:url value="/article/edit/${article.id}"/>">edit</a>--%>
            </td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
