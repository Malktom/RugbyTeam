<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="header.jsp"/>

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
                <div class="btn-group">
                    <button onclick="location.href='/app/users/delete/${user.id}'" type="button">delete</button>
                        <%--                    <button onclick="location.href='/app/users/edit/${user.id}'" type="button">edit</button>--%>


                </div>
            </td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
