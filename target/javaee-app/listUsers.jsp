<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users List</title>
    </head>
    <body>
        <h1>Users Lists</h1>
        <ul>
            <c:forEach items="${users}" var="user">
                <li>${user.username} ${user.password} ${user.person.name} ${user.person.lastname}</li>
            </c:forEach>
        </ul>
    </body>
</html>
