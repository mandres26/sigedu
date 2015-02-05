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
			<td><img src="resources/img/logoConsultisoft.png" width="350" height="100" border="0"></td>
		</tr>
	</table>
	<hr>
	<h2 class="Titulo">Editar Colegio</h2>
	<hr>
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="updateColegio" commandName="colegio">

		<table>
			<tr>
				<td>C&oacute;digo:</td>
				<td><form:input
						path="int_idcolegio" readonly="true"/></td>
			</tr>
			<tr>
				<td>Nombre Colegio:</td>
				<td><form:errors path="str_colegio" cssClass="error" /><br> <form:input
						path="str_colegio" /></td>
			</tr>
			<tr>
				<td>Tel&eacute;fono 1:</td>
				<td><form:errors path="str_telefono1" cssClass="error" /><br> <form:input
						path="str_telefono1" /></td>
			</tr>
			<tr>
				<td>Tel&eacute;fono 2:</td>
				<td><form:errors path="str_telefono2" cssClass="error" /><br> <form:input
						path="str_telefono2" /></td>
			</tr>
			<tr>
				<td>Celular:</td>
				<td><form:errors path="str_celular" cssClass="error" /><br> <form:input
						path="str_celular" /></td>
			</tr>
			<tr>
				<td>Direcci&oacute;n:</td>
				<td><form:errors path="str_direccion" cssClass="error" /><br> <form:input
						path="str_direccion" /></td>
			</tr>
			<tr>
				<td>Cantidad Salones:</td>
				<td><form:errors path="int_cantidad_salones" cssClass="error" /><br> <form:input
						path="int_cantidad_salones" /></td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td><form:radiobutton path="int_idestado" value=1 />Activo 
					&nbsp;
					<form:radiobutton path="int_idestado" value=2 />Inactivo</td>
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
	
    <a href="listColegio" cssClass="Navegador"><img src="resources/img/alumno.jpg" width="50" height="50" border="0" />Ir a Mantenimiento Colegio</a>
</body>
</html>