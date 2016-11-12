
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dlince.*"%>
<%@ page import="java.util.List"%>
<% List<Color> colores = (List<Color>)request.getAttribute("colores");%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
<title>Programación Web con Google App Engine</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta name="description" content="Ejemplos de proyectos de aplicaciones Web con Google App Engine.">
<meta name="keywords" content="Google app engine,Servlets,Java,GAE,HTML,CSS,JSP,Eclipse">
<meta name="author" content="Richart Escobedo (rescobedo)">
<link rel="icon" type="image/png" href="http://indice-ejemplos.appspot.com/Java-icon.png"> 
<link rel="stylesheet" type="text/css" href="http://indice-ejemplos.appspot.com/miestilo.css">
</head>
<body>
<!-- Menú de navegación del sitio -->
<ul class="navbar">
  <li><a href="/index.html">Regresar...</a>
  <li><a href="/color.jsp">Registro</a>
</ul>

<div class="Table">
	<div class="Title"><p>Mostrando <%= colores.size() %> colores</p></div>
	<div class="Heading">
		<div class="Cell"><p>Código</p></div>
		<div class="Cell"><p>Nombre</p></div>
		<div class="Cell"><p>E-mail</p></div>
		<div class="Cell"><p>Estado</p></div>
	</div>

<%for( Color c : colores ) {%>
	<div class="Row">
		<div class="Cell"><p><%= c.getIdColor() %></p></div>
		<div class="Cell"><p><%= c.getName() %></p></div>
		<div class="Cell"><p><%= c.getEmail() %></p></div>
		<div class="Cell"><p><%= c.isEstado() %></p></div>
	</div>
<%}%>
</div>
</body>
</html>