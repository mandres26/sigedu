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
	location.replace("editColegio?codigo="+codigo);
	//alert("hola");
}
</script>
<title>SIGEDU</title>
</head>

<body>
	<h2 class="Titulo">Datos del Colegio</h2>
	<hr>
		<div id="divView">
		<table>
			<tr>
				<td>C&oacute;digo:</td>
				<td>${colegio.codigo}</td>
			</tr>
			<tr>
				<td>Nombre Colegio:</td>
				<td>${colegio.nombre}</td>
			</tr>
			<tr>
				<td>Tel&eacute;fono 1:</td>
				<td>${colegio.telefono1}</td>
			</tr>
			<tr>
				<td>Tel&eacute;fono 2:</td>
				<td>${colegio.telefono2}</td>
			</tr>
			<tr>
				<td>Celular:</td>
				<td>${colegio.celular}</td>
			</tr>
			<tr>
				<td>Direcci&oacute;n:</td>
				<td>${colegio.direccion}</td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td>					
					<c:if test="${alumno.estado=='A'}">Activo</c:if>
					<c:if test="${alumno.estado=='I'}">Inactivo</c:if>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
				<td>
					<button title="Editar" onclick="javascript:editar('${colegio.codigo}')">
						<img src="resources/img/Editar.png" width="50" height="50" border="0">
					</button>
				</td>								
			</tr>			
		</table>
	</div>
	<a href="menuColegio" cssClass="Navegador"><img src="resources/img/alumno.jpg" width="50" height="50" border="0" />Ir a Men&uacute; Colegio</a>
</body>
</html>