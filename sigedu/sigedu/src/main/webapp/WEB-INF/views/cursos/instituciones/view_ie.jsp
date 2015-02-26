<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/titulos.css" type="text/css">
<script language="JavaScript" type="text/javascript">
function editar(codigo){
	location.replace("editIe?codigo="+codigo);
	//alert("hola");
}
</script>
<title>SIGEDU</title>
</head>

<body>
	<table width="1400" align="center">
		<tr>
			<td ><img src="resources/img/logoConsultisoft.png" width="350" height="100" border="0"></td>
		</tr>
	</table>	
	<hr width="1400">
	
	<h1 class="Titulo" align="center" width="1400">Datos de la Instituci&oacute;n Educativa</h1>
	<hr width="1400">
	
		<div id="divView">
		<table width="600" align="center">
			<tr>
				<td width="200">C&oacute;digo:</td>
				<td width="400">${ie.codigo}</td>
			</tr>
			<tr>
				<td width="200">Instituci&oacute;n Educativa:</td>
				<td width="400">${ie.str_ie}</td>
			</tr>
			<tr>
				<td width="200">Cod. Modular:</td>
				<td width="400">${ie.str_codigo_modular}</td>
			</tr>
			<tr>
				<td width="200">Cod. Local:</td>
				<td width="400">${ie.str_codigo_local}</td>
			</tr>
			<tr>
				<td width="200">Res. Autorizaci&oacute;n Func.:</td>
				<td width="400">${ie.str_res_autorizacion_func}</td>
			</tr>
			<tr>
				<td width="200">N&uacute;mero Resoluci&oacute;n:</td>
				<td width="400">${ie.str_resolucion_numero}</td>
			</tr>
			<tr>
				<td width="200">Tel&eacute;fono:</td>
				<td width="400">${ie.str_telefono}</td>
			</tr>
			<tr>
				<td width="200">Fax:</td>
				<td width="400">${ie.str_fax}</td>
			</tr>
			<tr>
				<td width="200">P&aacute;gina Web:</td>
				<td width="400">${ie.str_pagina_web}</td>
			</tr>
			<tr>
				<td width="200">Email:</td>
				<td width="400">${ie.str_email}</td>
			</tr>
			<tr>
				<td width="200">Fecha resoluci&oacute;n:</td>
				<td width="400">${ie.dte_fecha_resolucion}</td>
			</tr>
			<tr>
				<td width="200">D&iacute;s laborables:</td>
				<td width="400">${ie.str_dias_laborables}</td>
			</tr>
			<tr>
				<td width="200">Turno:</td>
				<td width="400">${ie.str_turno}</td>
			</tr>
			<tr>
				<td width="200">Fecha modificaci&oacute;n:</td>
				<td width="400">${ie.dte_fecha_modificacion}</td>
			</tr>
			<tr>
				<td width="200">Estado:</td>
				<td width="400">					
					<c:if test="${ie.int_idestado==1}">Activo</c:if>
					<c:if test="${ie.int_idestado==2}">Inactivo</c:if>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
				<td>
					<button title="Editar" onclick="javascript:editar('${ie.codigo}')">
						<img src="resources/img/Editar.png" width="50" height="50" border="0">
					</button>
				</td>								
			</tr>			
		</table>
	</div>
	<br>
	<hr width="1400">
	<br>
	<table width="1400" align="center">
	<tr>
		<td>
			<a href="listIe" cssClass="Navegador"><img src="resources/img/colegio.jpg" width="50" height="50" border="0" />Ir a Mantenimiento Instituci&oacute;n Educativa</a>		
		</td>
	</tr>
	</table>
	
</body>
</html>