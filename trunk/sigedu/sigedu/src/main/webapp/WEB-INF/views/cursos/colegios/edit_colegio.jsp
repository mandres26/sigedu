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
	<table width="1400" align="center">
		<tr>
			<td><img src="resources/img/logoConsultisoft.png" width="350" height="100" border="0"></td>
		</tr>
	</table>
	<hr width="1400">
	<h1 class="Titulo" align="center" width="1400">Editar Colegio</h1>
	<hr width="1400">
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="updateColegio" commandName="colegio">

		<table width="600" align="center">
			<tr>
				<td width="200">C&oacute;digo:</td>
				<td width="400"><form:input
						path="codigo" readonly="true"/></td>
			</tr>
			<tr>
				<td width="200">Nombre Colegio:</td>
				<td width="400"><form:errors path="str_colegio" cssClass="error" /><br> <form:input
						path="str_colegio" size="50" /></td>
			</tr>
			<tr>
				<td width="200">Direcci&oacute;n:</td>
				<td width="400"><form:errors path="str_direccion" cssClass="error" /><br> <form:input
						path="str_direccion" size="50" /></td>
			</tr>
			<tr>
				<td width="200">Tel&eacute;fono 1:</td>
				<td width="400"><form:errors path="str_telefono1" cssClass="error" /><br> <form:input
						path="str_telefono1" /></td>
			</tr>
			<tr>
				<td width="200">Tel&eacute;fono 2:</td>
				<td width="400"><form:errors path="str_telefono2" cssClass="error" /><br> <form:input
						path="str_telefono2" /></td>
			</tr>
			<tr>
				<td width="200">Celular:</td>
				<td width="400"><form:errors path="str_celular" cssClass="error" /><br> <form:input
						path="str_celular" /></td>
			</tr>
			
			<tr>
				<td width="200">Cantidad Salones:</td>
				<td width="400"><form:errors path="int_cantidad_salones" cssClass="error" /><br> <form:input
						path="int_cantidad_salones" /></td>
			</tr>
			<tr>
				<td width="200">Observaciones:</td>
				<td width="400"><form:errors path="str_observaciones" cssClass="error" /><br> 
							<form:input path="str_observaciones" size="50"/></td>
			</tr>
			<tr>
				<td width="200">Raz&oacute;n Social:</td>
				<td width="400"><form:errors path="str_razonsocial" cssClass="error" /><br> <form:input
						path="str_razonsocial" size="50" /></td>
			</tr>
			<tr>
				<td width="200">Nombre Comercial:</td>
				<td width="400"><form:errors path="str_nombrecomercial" cssClass="error" /><br> <form:input
						path="str_nombrecomercial" size="50" /></td>
			</tr>
			<tr>
				<td width="200">RUC:</td>
				<td width="400"><form:errors path="str_ruc" cssClass="error" /><br> <form:input
						path="str_ruc" /></td>
			</tr>
			<tr>
				<td width="200">Fecha creaci&oacute;n:</td>
				<td width="400"><form:errors path="dte_fecha_creacion" cssClass="error" /><br> 
						<form:input type="date" path="dte_fecha_creacion" /></td>
			</tr>
			<tr>
				<td width="200">Fecha modificaci&oacute;n:</td>
				<td width="400"><form:errors path="dte_fecha_modificacion" cssClass="error" /><br> 
						<form:input type="date" path="dte_fecha_modificacion" /></td>
			</tr>
			<tr>
				<td width="200">Estado:</td>
				<td width="400"><form:radiobutton path="int_idestado" value="1" />Activo 
					&nbsp;
					<form:radiobutton path="int_idestado" value="2" />Inactivo</td>
			</tr>
		</table>
		<br>
		<table width="1400" align="center">	
			<tr>
				<td align="right">
					<button type="reset" title="Limpiar">
						<img src="resources/img/Borrar.png" width="50" height="50" border="0">
					</button>
				</td>
				<td align="left">
					<button type="submit" title="Grabar">
						<img src="resources/img/Grabar.png" width="50" height="50" border="0">
					</button>
				</td>
			</tr>
		</table>
		
		<br>
		<hr width="1400" align="center">
		
		
	</form:form>
	<table width="1400" align="center">
	<tr>
		<td>
			<a href="listColegio" cssClass="Navegador"><img src="resources/img/alumno.jpg" width="50" height="50" border="0" />Ir a Mantenimiento Colegio</a>	
		</td>
	</tr>
	</table>
    
</body>
</html>