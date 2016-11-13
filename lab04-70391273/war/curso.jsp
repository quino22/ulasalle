<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<ul>
    <li><a href="index.html">Regresar...</a></li>
</ul>

    <form action="savecurso" method="get">
        <fieldset>
            <legend>Crear curso</legend>
            <label for="name">Nombre: <input type="text" name="name" value="TYSW"></label><br>
            <label for="creditos">Creditos<input type="text" name="creditos" value="5"></label><br>
            <select name="estado">
                <option value="true">Activo</option>
                <option value="false">Desactivado</option>
            </select><br>
            <input type="reset" value="Limpiar">
            <input type="submit" values="Enviar">
        </fieldset>
    </form>

</body>
</html>