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
	<h2 class="Titulo">Registro Nuevo Colegio</h2>
	<hr>
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="addColegio" commandName="colegio">

	<table width="1000" >
	<tr>
	<td>
		<table width="500">
			<tr>
				<td width="200">Colegio:</td>
				<td width="200"><form:errors path="str_colegio" cssClass="error" />
								<form:input path="str_colegio" size="50"/><br></td>
			</tr>
			
			<tr>
				<td width="200">Tel&eacute;fono 1:</td>
				<td width="200"><form:errors path="str_telefono1" cssClass="error" /> 
								<form:input path="str_telefono1" size="30"/><br></td>
			</tr>
			<tr>
				<td width="200">Tel&eacute;fono 2:</td>
				<td width="200"><form:errors path="str_telefono2" cssClass="error" />
				 				<form:input path="str_telefono2" size="30" /><br></td>
			</tr>
			<tr>
				<td width="200">Celular:</td>
				<td width="200"><form:errors path="str_celular" cssClass="error" />
								<form:input path="str_celular"  size="30"/><br></td>
			</tr>
			
		</table>
	</td>
	<td>
		<table width="500" >
			<tr>
				<td width="200">Direcci&oacute;n:</td>
				<td width="200"><form:errors path="str_direccion" cssClass="error" />
								<form:input	path="str_direccion" size="50"/></td>
			</tr>
			<!-- tr  >
				<td width="200">Departamento:</td>
				<td width="200"><select name="listarDepartamento" >
					<option selected> Seleccione departamento</option>
					<option value="1">Lima</option>
					<option value="2">Lambayeque</option>
					<option value="3">Piura</option>
					</select>
				</td>
			</tr -->
			<!--  tr>
				<td width="200">Provincia:</td>
				<td width="200"><select name="listarProvincia" >
					<option selected> Seleccione provincia</option>
					<option value="1">Lima</option>
					</select>
				</td>
			</tr -->
			<tr>
				<td width="200">Distrito: </td>
				<td width="200"><select name="listarDistrito" >
					<option selected> Seleccione distrito</option>
					<option value="1">Cercado</option>
					<option value="2">San Isidro</option>
					<option value="3">Lince</option>
					<option value="4">Breña</option>
					</select>
				</td>
			</tr>
			<tr>
				<td width="200">Cant. Salones:</td>
				<td width="200"><form:errors path="int_cantidad_salones" cssClass="error" /> 
								<form:input path="int_cantidad_salones"  size="10"/></td>
			</tr>
			<tr>
				<td width="200">Fecha creaci&oacute;n:</td>
				<td width="200"><form:errors path="dte_fecha_creacion" cssClass="error" /> 
					<form:input type="date" name="fecha_creacion" path="dte_fecha_creacion" /></td>
			</tr>
			<tr>
				<td width="200">Fecha modificaci&oacute;n:</td>
				<td width="200"><form:errors path="dte_fecha_modificacion" cssClass="error" />
					<form:input type="date" name="fecha_modificacion" path="dte_fecha_modificacion" /></td>
			</tr>
		</table>
	</td>
	</tr>
	</table>
	<br>
		<table>	
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
	<br>
	<hr>
	<br>
    <a href="listColegio" cssClass="Navegador"><img src="resources/img/colegio.jpg" width="50" height="50" border="0" />Ir a Mantenimiento Colegio</a>
</body>
</html>