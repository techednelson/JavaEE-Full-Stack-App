<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Person's Lists</title>
    </head>
    <body>
        <h1>Person's List</h1>
        <ul>
            <c:forEach items="${persons}" var="person">
                <li>${person.name} ${person.lastname}</li>
            </c:forEach>
        </ul>
    </body>
</html>
