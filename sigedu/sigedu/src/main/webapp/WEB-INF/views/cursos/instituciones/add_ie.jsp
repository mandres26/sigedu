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
	<h2 class="Titulo" width="1400" align="center">Registro Nueva Instituci&oacute;n Educativa</h2>
	<hr width="1400">
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="addIe" commandName="ie">

	<table width="1400" align="center"> 
	<tr>
	<td>
		<table width="700" border="1">
			<tr>
				<td width="200">Colegio:<br></td>
				<td width="200"><form:errors path="" cssClass="error" /><br>
								<form:input path="" size="45"/><br>
				</td>
				<td width="200"><form:input type="button" onclick="ventanaNueva()" /></td>
			</tr>
			<tr>
				<td width="200">Direcci&oacute;n:<br></td>
				<td width="500"><form:errors path="" cssClass="error" /><br>
								<form:input path="" size="45"/><br>
				</td>
			</tr>
			<tr>
				<td width="200">Distrito:<br></td>
				<td width="500"><form:errors path="" cssClass="error" /><br>
								<form:input path="" size="25"/><br>
				</td>
			</tr>
		</table>
	</td>
	<td>
		<table width="700" >
			<tr>
				<td width="200">Raz&oacute;n Social:<br></td>
				<td width="500"><form:errors path="" cssClass="error" /><br>
								<form:input path="" size="45"/><br>
				</td>
			</tr>
			<tr>
				<td width="200">RUC:<br></td>
				<td width="500"><form:errors path="" cssClass="error" /><br>
								<form:input path="" size="45"/><br>
				</td>
			</tr>
			<tr>
				<td width="200">Nombre Comercial:<br></td>
				<td width="500"><form:errors path="" cssClass="error" /><br>
								<form:input path="" size="45"/><br>
				</td>
			</tr>
		</table>
	</td>
	</tr>
	</table>	
	<hr width="1400">
	<table width="1400" align="center"> 
	<tr>
	<td>	
		<table width="700" >
			<tr>
				<td width="200">Instituci&oacute;n Educativa:<br></td>
				<td width="500"><form:errors path="str_ie" cssClass="error" /><br>
								<form:input path="str_ie" size="50"/><br></td>
			</tr>
			
			<tr>
				<td width="200">Cod. Modular:<br></td>
				<td width="500"><form:errors path="str_codigo_modular" cssClass="error" /><br>
								<form:input	path="str_codigo_modular" size="50"/><br></td>
			</tr>
			
			<tr>
				<td width="200">Cod. Local:<br></td>
				<td width="500"><form:errors path="str_codigo_local" cssClass="error" /><br>
								<form:input	path="str_codigo_local" size="50"/><br></td>
			</tr>
			<tr>
				<td width="200">Fecha creaci&oacute;n:<br></td>
				<td width="500"><form:errors path="dte_fecha_creacion" cssClass="error" /><br> 
					<form:input type="date" name="dte_fecha_creacion" path="dte_fecha_creacion" /><br></td>
			</tr>
			<tr>
				<td width="200">Fecha modificaci&oacute;n:<br></td>
				<td width="500"><form:errors path="dte_fecha_modificacion" cssClass="error" /><br>
					<form:input type="date" name="dte_fecha_modificacion" path="dte_fecha_modificacion" /><br></td>
			</tr>
			
			<tr>
				<td width="200">Res. Autorizaci&oacute;n Func.:<br></td>
				<td width="500"><form:errors path="str_res_autorizacion_func" cssClass="error" /><br> 
								<form:input path="str_res_autorizacion_func"  size="10"/><br></td>
			</tr>
			
			<tr>
				<td width="200">Res. N&uacute;mero:<br></td>
				<td width="500"><form:errors path="str_resolucion_numero" cssClass="error" /><br>
								<form:input path="str_resolucion_numero" size="30"/><br></td>
			</tr>
			<tr>
				<td width="200">Gesti&oacute;n: <br></td>
				<td width="500"><form:select path="parametro"  >
						<form:option value="" label="-- Seleccione --" />
						<form:options items="${listGestiones}" itemValue="int_idparametro" itemLabel="str_parametro" />
					</form:select>
				</td>
			</tr>
			
			<tr>
				<td width="200">G&eacute;nero: <br></td>
				<td width="500"><form:select path="parametro"  >
						<form:option value="" label="-- Seleccione --" />
						<form:options items="${listGeneros}" itemValue="int_idparametro" itemLabel="str_parametro" />
					</form:select>
				</td>
			</tr>
			
			<tr>
				<td width="200">Nivel: <br></td>
				<td width="500"><form:select path="parametro"  >
						<form:option value="" label="-- Seleccione --" />
						<form:options items="${listNiveles}" itemValue="int_idparametro" itemLabel="str_parametro" />
					</form:select>
				</td>
			</tr>
			
			<tr>
				<td width="200">Ugel: <br></td>
				<td width="500"><form:select path="parametro"  >
						<form:option value="" label="-- Seleccione --" />
						<form:options items="${listUgeles}" itemValue="int_idparametro" itemLabel="str_parametro" />
					</form:select>
				</td>
			</tr>
		</table>
	</td>
	<td width="50">
		&nbsp;
	</td>
	<td>
		<table width="700" ">
			<tr>
				<td width="200">Tel&eacute;fono:<br></td>
				<td width="500"><form:errors path="str_telefono" cssClass="error" /><br>
								<form:input path="str_telefono"  size="50" width="50" /><br></td>
			</tr>
			<tr>
				<td width="200">Fax:<br></td>
				<td width="500"><form:errors path="str_fax" cssClass="error" /><br>
								<form:input path="str_fax"  size="50" width="50" /><br></td>
			</tr>
			
			<tr>
				<td width="200">Pag. Web:<br></td>
				<td width="500"><form:errors path="str_pagina_web" cssClass="error" /><br>
								<form:input path="str_pagina_web"  size="50" width="50" /><br></td>
			</tr>
			<tr>
				<td width="200">Email:<br></td>
				<td width="500"><form:errors path="str_email" cssClass="error" /><br>
								<form:input path="str_email"  size="50" width="50" /><br></td>
			</tr>
			<tr>
				<td width="200">Fecha resoluci&oacute;n:<br></td>
				<td width="500"><form:errors path="dte_fecha_resolucion" cssClass="error" /><br> 
					<form:input type="date" name="dte_fecha_resolucion" path="dte_fecha_creacion" /><br></td>
			</tr>
			
			<tr>
				<td width="200">Días Laborales:<br></td>
				<td width="500"><form:errors path="str_dias_laborables" cssClass="error" /><br>
								<form:input path="str_dias_laborables"  size="50" width="50" /><br></td>
			</tr>
		
			<tr>
				<td width="200">Turno:<br></td>
				<td width="500"><form:errors path="str_turno" cssClass="error" /><br>
								<form:input path="str_turno"  size="50" width="50" /><br></td>
			</tr>
			<tr>
				<td width="200">Modalidad: <br></td>
				<td width="500"><form:select path="parametro"  >
						<form:option value="" label="-- Seleccione --" />
						<form:options items="${listModalidades}" itemValue="int_idparametro" itemLabel="str_parametro" />
					</form:select>
				</td>
			</tr>
			
			<tr>
				<td width="200">Forma: <br></td>
				<td width="500"><form:select path="parametro"  >
						<form:option value="" label="-- Seleccione --" />
						<form:options items="${listFormas}" itemValue="int_idparametro" itemLabel="str_parametro" />
					</form:select>
				</td>
			</tr>
			<tr>
				<td width="200">DRE: <br></td>
				<td width="500"><form:select path="parametro"  >
						<form:option value="" label="-- Seleccione --" />
						<form:options items="${listDres}" itemValue="int_idparametro" itemLabel="str_parametro" />
					</form:select>
				</td>
			</tr>
			
			<tr>
				<td width="200">Estado: <br></td>
				<td width="500"><form:select path="parametro"  >
						<form:option value="" label="-- Seleccione --" />
						<form:options items="${listEstados}" itemValue="int_idparametro" itemLabel="str_parametro" />
					</form:select>
				</td>
			</tr>
			
		</table>

	</td>
	</tr>
	</table>
	<br>
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
	
		
	</form:form>
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