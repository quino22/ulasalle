<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="pw2.*"%>
<%@ page import="java.util.ArrayList"%>
<%	ArrayList<Votante> votantes = (ArrayList<Votante>) getServletContext().getAttribute("votantes"); %>
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


<table border="1">
<%if( votantes != null   ){%>
	<tr><td>DNI</td><td>Nombres</td><td>Apellidos</td><td>Miembro de mesa</td><td>Departamento/Provincia/Departamento</td><td>Editar</td><td>Eliminar</td></tr>
	<%for(Votante v : votantes){%>
	<tr>
	<td><%=v.getDni()%></td><td><%=v.getNombres()%></td><td><%=v.getApellidos()%></td>
	<td><%=v.getMiembro()%></td>
	<td><%=v.getDepartamento()%>/<%=v.getProvincia()%>/<%=v.getDistrito()%></td>
	<% //System.out.println(v.getDni()+" "+v.getNombres()+" "+v.getApellidos());%>
	<td><a href="editar.jsp?dni=<%=v.getDni()%>">Editar</a></td>
	<td><a href="eliminarServlet?dni=<%=v.getDni()%>">Eliminar</a></td>
	</tr>
<%}}else{%>
	<tr><td>No hay votantes para mostrar.</td></tr>
<%}%>
</table>

</body>
</html>