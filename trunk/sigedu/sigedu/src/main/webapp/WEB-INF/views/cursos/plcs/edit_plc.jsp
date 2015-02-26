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
	<h1 class="Titulo" align="center" width="1400">Editar Plan Curricular</h1>
	<hr width="1400">
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="updatePlc" commandName="plc">

		<table width="1400" align="center">
			<tr>
				<td width="150">C&oacute;digo:</td>
				<td width="850"><form:input
						path="int_idplc" readonly="true"/></td>
			</tr>
			<tr>
				<td width="150">Nombre PLC:</td>
				<td width="850"><form:errors path="str_plc" cssClass="error" /><br> <form:input
						path="str_plc" size="50" /></td>
			</tr>
			<tr>
				<td width="150">Fecha Inicio:</td>
				<td width="850"><form:errors path="dte_fecha_inicio" cssClass="error" /><br> <form:input
						path="dte_fecha_inicio" /></td>
			</tr>
			<tr>
				<td width="150">Fecha Fin:</td>
				<td width="850"><form:errors path="dte_fecha_fin" cssClass="error" /><br> <form:input
						path="dte_fecha_fin" /></td>
			</tr>
			<tr>
				<td width="150">Fecha creaci&oacute;n:</td>
				<td width="850"><form:errors path="dte_fecha_creacion" cssClass="error" /><br> <form:input
						path="dte_fecha_creacion" /></td>
			</tr>
			<tr>
				<td width="150">Fecha modificaci&oacute;n:</td>
				<td width="850"><form:errors path="dte_fecha_modificacion" cssClass="error" /><br> <form:input
						path="dte_fecha_modificacion" size="50" /></td>
			</tr>
			<tr>
				<td width="150">Estado:</td>
				<td width="850"><form:radiobutton path="int_idestado" value="1" />Activo 
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
			<a href="listPlc" cssClass="Navegador"><img src="resources/img/alumno.jpg" width="50" height="50" border="0" />Ir a Mantenimiento PLC</a>	
		</td>
	</tr>
	</table>
    
</body>
</html>