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
	<h1 class="Titulo" align="center" width="1400">Editar Instituci&oacute;n Educativa</h1>
	<hr width="1400">
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="updateIe" commandName="ie">

		<table width="600" align="center">
			<tr>
				<td width="200">C&oacute;digo:</td>
				<td width="400"><form:input
						path="codigo" readonly="true"/></td>
			</tr>
			<tr>
				<td width="200">IE:</td>
				<td width="400"><form:errors path="str_ie" cssClass="error" /><br> <form:input
						path="str_ie" size="50" /></td>
			</tr>
			<tr>
				<td width="200">Cod. Modular:</td>
				<td width="400"><form:errors path="str_codigo_modular" cssClass="error" /><br> <form:input
						path="str_codigo_modular" size="30" /></td>
			</tr>
			<tr>
				<td width="200">Cod. Local:</td>
				<td width="400"><form:errors path="str_codigo_local" cssClass="error" /><br> <form:input
						path="str_codigo_local"  size="30" /></td>
			</tr>
			<tr> 
				<td width="200">Res. Autorizaci&oacute;n Func.:</td>
				<td width="400"><form:errors path="str_res_autorizacion_func" cssClass="error" /><br> <form:input
						path="str_res_autorizacion_func"  size="30" /></td>
			</tr>
			<tr>
				<td width="200">Res. N&uacute;mero:</td>
				<td width="400"><form:errors path="str_resolucion_numero" cssClass="error" /><br> <form:input
						path="str_resolucion_numero" size="30" /></td>
			</tr>
			<tr>
				<td width="200">Tel&eacute;fono:</td>
				<td width="400"><form:errors path="str_telefono" cssClass="error" /><br> <form:input
						path="str_telefono" size="30" /></td>
			</tr>
			<tr>
				<td width="200">Fax:</td>
				<td width="400"><form:errors path="str_fax" cssClass="error" /><br> <form:input
						path="str_fax" size="30" /></td>
			</tr>
			<tr>
				<td width="200">P&aacute;gina web:</td>
				<td width="400"><form:errors path="str_pagina_web" cssClass="error" /><br> <form:input
						path="str_pagina_web" size="50" /></td>
			</tr>
			<tr>
				<td width="200">Email:</td>
				<td width="400"><form:errors path="str_email" cssClass="error" /><br> <form:input
						path="str_email" size="50" /></td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
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
			<a href="listIe" cssClass="Navegador"><img src="resources/img/alumno.jpg" width="50" height="50" border="0" />Ir a Mantenimiento Instituci&oacute;n Educativa</a>	
		</td>
	</tr>
	</table>
    
</body>
</html>