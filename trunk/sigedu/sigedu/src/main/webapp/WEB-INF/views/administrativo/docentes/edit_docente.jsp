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
    <table>
		<tr>
			<td><img src="resources/img/logo.png" width="350" height="100" border="0"></td>
		</tr>
	</table>
	<hr>
	<h2 class="Titulo">Editar Docente</h2>
	<hr>
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="updateDocente" commandName="docente">

		<table>
			<tr>
				<td>C&oacute;digo:</td>
				<td><form:input
						path="int_iddocente" readonly="true"/></td>
			</tr>
			<tr>
				<td>Nombres:</td>
				<td><form:errors path="str_nombre" cssClass="error" /><br> <form:input
						path="str_nombre" /></td>
			</tr>
			<tr>
				<td>Ap.Paterno</td>
				<td><form:errors path="str_apellido_paterno" cssClass="error" /><br> <form:input
						path="str_apellido_paterno" /></td>
			</tr>
			<tr>
				<td>Ap. Materno:</td>
				<td><form:errors path="str_apellido_materno" cssClass="error" /><br> <form:input
						path="str_apellido_materno" /></td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td><form:radiobutton path="int_idestado" value='1' />Activo 
					&nbsp;
					<form:radiobutton path="int_idestado" value='2' />Inactivo</td>
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
	
    <a href="listDocentes" cssClass="Navegador"><img src="resources/img/docente.jpg" width="50" height="50" border="0" />Ir a Mantenimiento Docente</a>
</body>
</html>