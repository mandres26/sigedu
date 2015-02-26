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
	<h2 class="Titulo" width="1400" align="center">Registro Nuevo Diseño Curricular Nacional</h2>
	<hr width="1400">
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="addDcn" commandName="dcn">

	<table width="1400" align="center"> 
	<tr>
	<td>
		<table width="700">
			<tr>
				<td width="150">Nombre DCN:<br></td>
				<td width="550"><form:errors path="str_dcn" cssClass="error" /><br>
								<form:input path="str_dcn" size="50"/><br></td>
			</tr>
			<tr>
				<td width="150">Fecha inicio vigencia:<br></td>
				<td width="550"><form:errors path="dte_fecha_inicio_vig" cssClass="error" /><br> 
					<form:input type="date" name="dte_fecha_inicio_vig" path="dte_fecha_inicio_vig" /><br></td>
			</tr>
			<tr>
				<td width="150">Fecha fin vigencia:<br></td>
				<td width="550"><form:errors path="dte_fecha_fin_vig" cssClass="error" /><br>
					<form:input type="date" name="dte_fecha_fin_vig" path="dte_fecha_fin_vig" /><br></td>
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
				<td width="150">Modalidad: <br></td>
				<td width="550"><select name="listarModalidad" >
						<option selected> Seleccione modalidad</option>
						<option value="1">Centro Educativo Ocupacional</option>
						<option value="2">Educaci&oacute;n B&acute;sica Alternativa</option>
						<option value="3">Educaci&oacute;n B&acute;sica Regular</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td>
					&nbsp;
				</td>
			</tr>
			
			<tr>
				<td width="150">Tipo de Centro: <br></td>
				<td width="550"><select name="listarTipoCentro" >
						<option selected> Seleccione tipo de centro</option>
						<option value="1">Colegio</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td width="150">Estado: <br></td>
				<td width="550"><select name="listarEstado" ><br>
						<option selected> Seleccione estado</option>
						<option value="1">Activo</option>
						<option value="2">Inactivo</option>
						<option value="3">Cerrado</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td width="150">Fecha modificaci&oacute;n:<br></td>
				<td width="550"><form:errors path="dte_fecha_modificacion" cssClass="error" /><br>
					<form:input type="date" name="fecha_modificacion" path="dte_fecha_modificacion" /><br></td>
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
				<a href="listDcn" cssClass="Navegador"><img src="resources/img/colegio.jpg" width="50" height="50" border="0" />Ir a Mantenimiento DCN</a>	
			</td>
		</tr>
	</table>
	
</body>
</html>