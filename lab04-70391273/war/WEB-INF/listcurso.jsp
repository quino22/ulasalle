<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="ulasalle.*"%>
<%@ page import="java.util.List"%>
<% List<Curso> curso = (List<Curso>)request.getAttribute("curso");%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<ul>
    <li><a href="../index.html">Regresar...</a></li>
    <li><a href="../curso.jsp">Crear curso nuevo</a></li>
</ul>

<table>
    <caption>Lista de cursos</caption>
    <thead>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Creditos</th>
            <th>Estado</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <% for (Curso c : curso) { %>
                <td><%= c.getIdCurso() %></td>
                <td><%= c.getName() %></td>
                <td><%= c.getCreditos() %></td>
                <td><%= c.getEstado() %></td>    
            <% }%>    
            
        </tr>
    </tbody>
</table>

</body>
</html>