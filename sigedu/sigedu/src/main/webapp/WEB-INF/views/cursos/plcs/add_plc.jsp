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

<script language="JavaScript">
function listarAnhos(idanho){
	var form = document.forms(0);
	form.action="listarAnhos";
	form.submit();
}

</script>

<title>SIGEDU</title>
</head>
<body>
	<table width="1400" align="center">
		<tr>
			<td><img src="resources/img/logoConsultisoft.png" width="350" height="100" border="0"></td>
		</tr>
	</table>
	<hr width="1400">
	
	<h1 class="Titulo" width="1400" align="center">Registro Nuevo Plan Curricular</h1>
	
	<hr width="1400">
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="addPlc" commandName="plc">

	<table width="1400" align="center"> 
	<tr>
	<td>
		<table width="700">
			<tr>
				<td width="150">Nombre PLC:<br></td>
				<td width="550"><form:errors path="str_plc" cssClass="error" /><br>
								<form:input path="str_plc" size="50"/><br></td>
			</tr>
			<tr>
				<td width="150">Fecha Inicio:<br></td>
				<td width="550"><form:errors path="dte_fecha_inicio" cssClass="error" /><br> 
					<form:input type="date" name="dte_fecha_inicio" path="dte_fecha_inicio" /><br></td>
			</tr>
			<tr>
				<td width="150">Fecha Fin:<br></td>
				<td width="550"><form:errors path="dte_fecha_fin" cssClass="error" /><br>
					<form:input type="date" name="dte_fecha_fin" path="dte_fecha_fin" /><br></td>
			</tr>
			<tr>
				<td width="150">Fecha creaci&oacute;n:<br></td>
				<td width="550"><form:errors path="dte_fecha_creacion" cssClass="error" /><br> 
					<form:input type="date" name="fecha_creacion" path="dte_fecha_creacion" /><br></td>
			</tr>
			
				
		</table>
	</td>
	<td width="50">
		&nbsp;
	</td>
	<td>
		<table width="700" >
			<tr>
				<td width="150">Año: <br></td>
				<td width="550"><form:select path="anho"  ><br>
						<form:option value="" label="-- Seleccione --" />
						<form:options items="${listAnhos}" itemValue="int_idanho" itemLabel="str_anho" />
					</form:select>
				</td>
			</tr>
			<tr>
				<td width="50">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td width="150">Fecha modificaci&oacute;n:<br></td>
				<td width="550"><form:errors path="dte_fecha_modificacion" cssClass="error" /><br>
					<form:input type="date" name="fecha_modificacion" path="dte_fecha_modificacion" /><br></td>
			</tr>
			<tr>
				<td width="50">
					&nbsp;
				</td>
			</tr>
	
			<tr>
				<td width="150">Estado: <br></td>
				<td width="550"><select name="listarEstado" ><br>
						<option selected> Seleccione estado</option>
						<option value="1">Activo</option>
						<option value="2">Inactivo</option>
					</select>
				</td>
			</tr>
			
		</table>

	</td>
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
				<a href="listPlc" cssClass="Navegador"><img src="resources/img/colegio.jpg" width="50" height="50" border="0" />Ir a Mantenimiento PLC</a>	
			</td>
		</tr>
	</table>
	
</body>
</html>