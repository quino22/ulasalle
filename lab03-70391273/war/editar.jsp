<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="pw2.*"%>
<%@ page import="java.util.ArrayList"%>
<%	ArrayList<Votante> votantes = (ArrayList<Votante>) getServletContext().getAttribute("votantes"); %>
<% String dnix = request.getParameter("dni"); %>
<% int i = 0;%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Votantes</title>
</head>
<body>
<!-- Menú de navegación del sitio -->
<ul class="navbar">
  <li><a href="buscar.html">Buscar</a>
  <li><a href="registrar.html">Registrar</a>
  <li><a href="votantes.jsp">Ver</a>
  <%if( votantes != null   ){%>
  <li><a href="vaciarServlet">Vaciar</a>
  <%}%>
</ul>

<form name="editarForm" method="post" action="editarServlet?dnix=<%= dnix %>">
<% for(Votante v : votantes){ %>
<% if(v.getDni().equals(dnix)){ %>
<label>Nombres: </label><input type="text" name="nombres" value="<%=votantes.get(i).getNombres() %>" /> <br />
<label>Apellidos: </label><input type="text" name="apellidos" value="<%=votantes.get(i).getApellidos() %>" /> <br />
<label>Condición: </label><select name="miembro">
	<option value="True">Sí es miembro de mesa</option>
	<option value="False" selected="selected">No es miembro de mesa</option>
</select> <br />
<input type="text" name="departamento" value="<%=votantes.get(i).getDepartamento() %>" /><span>/</span>
<input type="text" name="provincia" value="<%=votantes.get(i).getProvincia() %>" /><span>/</span>
<input type="text" name="distrito" value="<%=votantes.get(i).getDistrito() %>" /> <br />
<label>Mesa de sufragio: </label><input type="text" name="mesa" value="<%=votantes.get(i).getMesa() %>" /> <br />
<label>Local de votación: </label><input type="text" name="local" value="<%=votantes.get(i).getLocal() %>" /> <br />
<label>Pabellón: </label><input type="text" name="pabellon" value="<%=votantes.get(i).getPabellon() %>" /> <br />
<label>Piso: </label><input type="text" name="piso" value="<%=votantes.get(i).getPiso() %>" /> <br />
<label>Aula: </label><input type="text" name="aula" value="<%=votantes.get(i).getAula() %>" /> <br />
<a href="#">Ver croquis de tu local de votación</a> <br />
<label>Dirección: </label><input type="text" name="direccion" value="<%=votantes.get(i).getDireccion() %>" /> <br />
<input type="submit" value="Guardar" />	
<%} %>
<%i++; %>
<%} %>
</form>




</body>
</html>