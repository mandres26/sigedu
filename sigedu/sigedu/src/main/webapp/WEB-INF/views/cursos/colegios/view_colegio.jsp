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
	<table>
		<tr>
			<td><img src="resources/img/logoConsultisoft.png" width="350" height="100" border="0"></td>
		</tr>
	</table>
	<hr>
	<h2 class="Titulo">Datos del Colegio</h2>
	<hr>
		<div id="divView">
		<table>
			<tr>
				<td>C&oacute;digo:</td>
				<td>${colegio.int_idcolegio}</td>
			</tr>
			<tr>
				<td>Nombre Colegio:</td>
				<td>${colegio.str_colegio}</td>
			</tr>
			<tr>
				<td>Tel&eacute;fono 1:</td>
				<td>${colegio.str_telefono1}</td>
			</tr>
			<tr>
				<td>Tel&eacute;fono 2:</td>
				<td>${colegio.str_telefono2}</td>
			</tr>
			<tr>
				<td>Celular:</td>
				<td>${colegio.str_celular}</td>
			</tr>
			<tr>
				<td>Direcci&oacute;n:</td>
				<td>${colegio.str_direccion}</td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td>					
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
	<a href="listColegio" cssClass="Navegador"><img src="resources/img/colegio.jpg" width="50" height="50" border="0" />Ir a Mantenimiento Colegio</a>
</body>
</html>