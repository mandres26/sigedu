<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/validacion.css" title="validacion" type="text/css">
<link rel="stylesheet" href="resources/css/links.css" title="links" type="text/css">
<link rel="stylesheet" href="resources/css/mensajes.css" type="text/css">
<link rel="stylesheet" href="resources/css/controles.css" type="text/css">
<link rel="stylesheet" href="resources/css/titulos.css" type="text/css">
<title>SIGEDU</title>
</head>
<body>
	<h2 class="Titulo">Nuevo Colegio</h2>
	<hr>
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="addColegio" commandName="colegio">

		<table>
			<tr>
				<td>Nombre Colegio:</td>
				<td><form:errors path="nombre" cssClass="error" /><br> <form:input
						path="nombre" /></td>
			</tr>
			<tr>
				<td>Tel&eacute;fono 1:</td>
				<td><form:errors path="telefono1" cssClass="error" /><br> <form:input
						path="telefono1" /></td>
			</tr>
			<tr>
				<td>Tel&eacute;fono 2:</td>
				<td><form:errors path="telefono2" cssClass="error" /><br> <form:input
						path="telefono2" /></td>
			</tr>
			<tr>
				<td>Celular:</td>
				<td><form:errors path="celular" cssClass="error" /><br> <form:input
						path="celular" /></td>
			</tr>
			<tr>
				<td>Direcci&oacute;n:</td>
				<td><form:errors path="direccion" cssClass="error" /><br> <form:input
						path="direccion" /></td>
			</tr>
			<tr>
				<td>
					<button type="reset" title="Limpiar">
						<img src="resources/img/Borrar.png" width="50" height="50" border="0">
					</button>
				</td>
				<td>
					<button type="submit" title="Grabar">
						<img src="resources/img/Grabar.png" width="50" height="50" border="0">
					</button>
				</td>
				
			</tr>
		</table>
		
	</form:form>
	
    <a href="menuColegio" cssClass="Navegador"><img src="resources/img/alumno.jpg" width="50" height="50" border="0" />Ir a Men&uacute; Colegio</a>
</body>
</html>