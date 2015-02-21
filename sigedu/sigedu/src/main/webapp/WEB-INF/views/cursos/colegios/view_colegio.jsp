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
function editar(int_idcolegio){
	location.replace("editColegio?int_idcolegio="+int_idcolegio);
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
	
	<h1 class="Titulo" align="center" width="1400">Datos del Colegio</h1>
	<hr width="1400">
	
		<div id="divView">
		<table width="1400" align="center">
			<tr>
				<td width="150">C&oacute;digo:</td>
				<td width="800">${colegio.int_idcolegio}</td>
			</tr>
			<tr>
				<td width="150">Nombre Colegio:</td>
				<td width="800">${colegio.str_colegio}</td>
			</tr>
			<tr>
				<td width="150">Tel&eacute;fono 1:</td>
				<td width="800">${colegio.str_telefono1}</td>
			</tr>
			<tr>
				<td width="150">Tel&eacute;fono 2:</td>
				<td width="800">${colegio.str_telefono2}</td>
			</tr>
			<tr>
				<td width="150">Celular:</td>
				<td width="800">${colegio.str_celular}</td>
			</tr>
			<tr>
				<td width="150">Direcci&oacute;n:</td>
				<td width="800">${colegio.str_direccion}</td>
			</tr>
			<tr>
				<td width="150">Estado:</td>
				<td width="800">					
					<c:if test="${colegio.int_idestado==1}">Activo</c:if>
					<c:if test="${colegio.int_idestado==2}">Inactivo</c:if>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
				<td>
					<button title="Editar" onclick="javascript:editar('${colegio.int_idcolegio}')">
						<img src="resources/img/Editar.png" width="50" height="50" border="0">
					</button>
				</td>								
			</tr>			
		</table>
	</div>
	<br>
	<hr>
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