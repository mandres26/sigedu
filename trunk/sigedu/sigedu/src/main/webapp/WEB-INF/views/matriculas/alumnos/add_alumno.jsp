<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/validacion.css"
	title="validacion" type="text/css">
<link rel="stylesheet" href="resources/css/links.css" title="links"
	type="text/css">
<link rel="stylesheet" href="resources/css/mensajes.css" type="text/css">
<link rel="stylesheet" href="resources/css/controles.css"
	type="text/css">
<link rel="stylesheet" href="resources/css/titulos.css" type="text/css">

<script language="JavaScript">
function listarProvincias(idDepartamento){
	var form = document.forms(0);
	form.action="listarProvincias";
	form.submit();
}

</script>

<title>SIGEDU</title>
</head>
<body>
	<h2 class="Titulo">Nuevo Alumno</h2>
	<hr>

	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
	${mensaje}
	</h3>
	<form:form method="post" action="addAlumno" commandName="alumno">

		<table>
			<tr>
				<td>Nombres:</td>
				<td><form:errors path="nombres" cssClass="error" /><br> <form:input
						path="nombres" /></td>
			</tr>
			<tr>
				<td>Ap.Paterno</td>
				<td><form:errors path="paterno" cssClass="error" /><br> <form:input
						path="paterno" /></td>
			</tr>
			<tr>
				<td>Ap. Materno:</td>
				<td><form:errors path="materno" cssClass="error" /><br> <form:input
						path="materno"  /></td>
			</tr>
		</table>

		<table>
			<tr>
				<td>Departamento:</td>
				<td> 
					<form:select path="distrito.provincia.departamento" onChange="JavaScript:listarProvincias(this.value)">
						<form:option value="" label="-- Seleccione --" />
    					<form:options items="${listDepartamentos}" itemValue="id" itemLabel="nombre" />
					</form:select>
				
				</td>
			</tr>
		</table>

		<table>
			<tr>
				<td>
					<button type="reset" title="Limpiar">
						<img src="resources/img/Borrar.png" width="50" height="50"
							border="0">
					</button>
				</td>
				<td>
					<button type="submit" title="Grabar">
						<img src="resources/img/Grabar.png" width="50" height="50"
							border="0">
					</button>
				</td>

			</tr>
		</table>

	</form:form>

	<a href="menuAlumno" cssClass="Navegador"><img
		src="resources/img/alumno.jpg" width="50" height="50" border="0" />Ir
		a Menu Alumno</a>
</body>
</html>