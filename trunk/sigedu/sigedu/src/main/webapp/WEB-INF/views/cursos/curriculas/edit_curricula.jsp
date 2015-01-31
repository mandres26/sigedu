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
	<h2 class="Titulo">Editar Currícula</h2>
	<hr>
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="updateCurricula" commandName="curricula">

		<table>
			<tr>
				<td>C&oacute;digo:</td>
				<td><form:input
						path="codigo" readonly="true"/></td>
			</tr>
			<tr>
				<td>Colegio:</td>
				<td><form:errors path="colegio" cssClass="error" /><br> <form:input
						path="colegio" /></td>
			</tr>
			<tr>
				<td>Curso:</td>
				<td><form:errors path="curso" cssClass="error" /><br> <form:input
						path="curso" /></td>
			</tr>
			<tr>
				<td>Grado:</td>
				<td><form:errors path="grado" cssClass="error" /><br> <form:input
						path="grado" /></td>
			</tr>
			<tr>
				<td>Nombre:</td>
				<td><form:errors path="nombre" cssClass="error" /><br> <form:input
						path="nombre" /></td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td><form:radiobutton path="estado" value="A" />Activo 
					&nbsp;
					<form:radiobutton path="estado" value="I" />Inactivo</td>
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
	
    <a href="menuCurricula" cssClass="Navegador"><img src="resources/img/alumno.jpg" width="50" height="50" border="0" />Ir a Men&uacute; Curr&iacute;cula</a>
</body>
</html>