<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dlince.*"%>
<%@ page import="java.util.List"%>

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
  <li><a href="/listpersona02">Lista</a>
</ul>

<%List<Color> colores = (List<Color>)request.getAttribute("colores");%>
<%if(colores.size()>0){ %>
	<form action="savepersona02" method="get">
	<fieldset><legend>Registro de persona</legend>
	<div id="formulario">
		<div class="fila">
			<div class="etiqueta"><label for="name">Nombre :</label></div>
			<div class="control"><input type="text" name="name" maxlength="10" value="María" /></div>
		</div>
		<div class="fila">
			<div class="etiqueta"><label for="lastname">Apellido :</label></div>
			<div class="control"><input type="text" name="lastname" maxlength="10" value="Gómez" /></div>
		</div>
		<div class="fila">
			<div class="etiqueta"><label for="email">Correo :</label></div>
			<div class="control"><input type="text" name="email" maxlength="20" value="mgomez@hotmail.com" /></div>
		</div>
	
		<div class="fila">
			<div class="etiqueta"><label for="color">Color favorito:</label></div>
			<div class="control">
				<select name="color" size="1">
		 			<%for( Color c : colores ) {%>
						<%= "<option value=\""+c.getIdColor()+"\">"+c.getName()+"</option>" %>
					<%}%>
				</select>
			</div>
		</div>
		<div class="fila">
			<div id="action"><input type="reset" value="Limpiar"/><input type="submit" value="Enviar"/></div>
		</div>
	</div>
	</fieldset>
	</form>
<%}else{%>
	<p>No hay colores todavia.<a href="/color.jsp">Haga clic aquí para Agregar colores.</a>
<%}%>

</body>
</html>