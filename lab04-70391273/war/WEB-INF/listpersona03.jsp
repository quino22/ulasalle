<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dlince.*"%>
<%@ page import="java.util.List"%>

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
  <li><a href="/persona03">Registro</a>
</ul>
<%
List<Persona03> personas = (List<Persona03>)request.getAttribute("personas");
%>
<div class="Table">
	<div class="Title"><p>Mostrando <%= personas.size() %> personas</p></div>
	<div class="Heading">
	<div class="Cell"><p>Código</p></div>
		<div class="Cell"><p>Nombres</p></div>
		<div class="Cell"><p>Apellidos</p></div>
		<div class="Cell"><p>Correo electrónico</p></div>
		<div class="Cell"><p>Colores</p></div>
	</div>

<% for( Persona03 p : personas ) { %>	
	<div class="Row">
		<div class="Cell"><p><%= p.getIdPersona() %></p></div>
		<div class="Cell"><p><%= p.getName() %></p></div>
		<div class="Cell"><p><%= p.getLastname() %></p></div>
		<div class="Cell"><p><%= p.getEmail() %></p></div>
		<div class="Cell"><p>
		<% for( Color c : p.getColor() ) { %>
			<%="<span style=\"background-color:"+c.getName()+"\">"+c.getName()+"</span>"%>
		<% } %>
		</p></div>
	</div>
<% } %>
</div>
</body>
</html>