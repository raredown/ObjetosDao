<%-- 
    Document   : respuesta
    Created on : 17-nov-2016, 19:29:45
    Author     : Daw2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:set var="alumnito" value="${requestScope.aluminitos}" />
        <c:forEach var="iten" items="${alumnito}">
            <p>
            <c:out value="${iten.idAlumno}"/>
             <c:out value="${iten.nombre}"/>
             <c:out value="${iten.grupo}"/>
             </p>
        </c:forEach>
</body>
</html>
