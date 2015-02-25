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
	<h2 class="Titulo" width="1400" align="center">Registro Nuevo Colegio</h2>
	<hr width="1400">
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="addColegio" commandName="colegio">

	<table width="1400" align="center"> 
	<tr>
	<td>
		<table width="700" >
			<tr>
				<td width="150">Nombre Colegio:<br></td>
				<td width="550"><form:errors path="str_colegio" cssClass="error" /><br>
								<form:input path="str_colegio" size="50"/><br></td>
			</tr>
			<tr>
				<td width="150">Direcci&oacute;n:<br></td>
				<td width="550"><form:errors path="str_direccion" cssClass="error" /><br>
								<form:input	path="str_direccion" size="50"/><br></td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td width="150">Departamento:<br></td>
				<td width="550"> 
					<form:select path="distrito.provincia.departamento" onChange="JavaScript:listarProvincias(this.value)">
						<form:option value="" label="-- Seleccione --" /><br>
    					<form:options items="${listDepartamentos}" itemValue="id" itemLabel="nombre" /><br>
					</form:select>
				</td>
			</tr>
			<tr>
				<td width="150">Cant. Salones:<br></td>
				<td width="550"><form:errors path="int_cantidad_salones" cssClass="error" /><br> 
								<form:input path="int_cantidad_salones"  size="10"/><br></td>
			</tr>
			<tr>
				<td width="150">Tel&eacute;fono 1:<br></td>
				<td width="550"><form:errors path="str_telefono1" cssClass="error" /><br>
								<form:input path="str_telefono1" size="30"/><br></td>
			</tr>
			<tr>
				<td width="150">Tel&eacute;fono 2:<br></td>
				<td width="550"><form:errors path="str_telefono2" cssClass="error" /><br>
				 				<form:input path="str_telefono2" size="30" /><br></td>
			</tr>
			<tr>
				<td width="150">Celular: <br></td>
				<td width="550"><form:errors path="str_celular" cssClass="error" /><br>
								<form:input path="str_celular"  size="30"/><br></td>
			</tr>
		</table>
	</td>
	<td width="50">
		&nbsp;
	</td>
	<td>
		<table width="700" >
			<tr>
				<td width="150">Tipo Contribuyente: <br></td>
				<td width="550"><form:select path="parametro"  ><br>
						<form:option value="" label="-- Seleccione --" />
						<form:options items="${listTipocontribuyentes}" itemValue="int_idparametro" itemLabel="str_parametro" />
					</form:select>
				</td>
			</tr>
			
			<tr>
				<td width="150">Raz&oacute;n Social:<br></td>
				<td width="550"><form:errors path="str_razonsocial" cssClass="error" /><br>
								<form:input path="str_razonsocial"  size="50" width="50" /><br></td>
			</tr>
			<tr>
				<td width="150">Nombre Comercial:<br></td>
				<td width="550"><form:errors path="str_nombrecomercial" cssClass="error" /><br>
								<form:input path="str_nombrecomercial"  size="50" width="50" /><br></td>
			</tr>
			<tr>
				<td width="150">RUC:<br></td>
				<td width="550"><form:errors path="str_ruc" cssClass="error" /><br>
								<form:input path="str_ruc"  size="30" width="30" /><br></td>
			</tr>
			<tr>
				<td width="150">Fecha creaci&oacute;n:<br></td>
				<td width="550"><form:errors path="dte_fecha_creacion" cssClass="error" /><br> 
					<form:input type="date" name="fecha_creacion" path="dte_fecha_creacion" /><br></td>
			</tr>
			<tr>
				<td width="150">Fecha modificaci&oacute;n:<br></td>
				<td width="550"><form:errors path="dte_fecha_modificacion" cssClass="error" /><br>
					<form:input type="date" name="fecha_modificacion" path="dte_fecha_modificacion" /><br></td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td width="150">Estado: <br></td>
				<td width="550"><form:select path="parametro"  >
						<form:option value="" label="-- Seleccione --" /><br>
						<form:options items="${listEstados}" itemValue="int_idparametro" itemLabel="str_parametro" /><br>
					</form:select>
				</td>
			</tr>
		</table>
	</td>
	</tr>
	</table>
	<table width="1400" align="center">
	<tr>
		<td width="150" valign="top">Observaciones: <br></td>
		<td width="1200"><form:errors path="str_observaciones" cssClass="error" />
								<form:textarea path="str_observaciones" rows="5" cols="150" /></td>
	</tr>
	</table>
	
	<br><br>
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
	
		
	</form:form>
	<br>
	<hr width="1400">
	<br>
	
	<table width="1400" align="center">
		<tr>
			<td>
				<a href="listColegio" cssClass="Navegador"><img src="resources/img/colegio.jpg" width="50" height="50" border="0" />Ir a Mantenimiento Colegio</a>	
			</td>
		</tr>
	</table>
	
</body>
</html>