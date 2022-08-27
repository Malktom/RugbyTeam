<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <jsp:include page="formStyle.jsp"/>
</head>

<body>
<jsp:include page="navi.jsp"/>

<table>
    <tr>
        <th>id</th>
        <th>login</th>
        <th>email</th>
        <th>role</th>


    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.login}</td>
            <td>${user.email}</td>
            <td>${user.role}</td>

            <td>
<%--                <a href="<c:url value="/category/delete/${category.id}"/>">delete</a>--%>
<%--                <a href="<c:url value="/category/edit/${category.id}"/>">edit</a>--%>
            </td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
