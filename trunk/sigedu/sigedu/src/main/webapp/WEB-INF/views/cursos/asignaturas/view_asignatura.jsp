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
	location.replace("editAlumno?codigo="+codigo);
	//alert("hola");
}
</script>
<title>SIGEDU</title>
</head>

<body>
	<h2 class="Titulo">Datos de Asignatura</h2>
	<hr>
		<div id="divView">
		<table>
			<tr>
				<td>C&oacute;digo:</td>
				<td>${asignatura.codigo}</td>
			</tr>
			<tr>
				<td>Nombre:</td>
				<td>${asignatura.nombre}</td>
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
					<button title="Editar" onclick="javascript:editar('${asignatura.codigo}')">
						<img src="resources/img/Editar.png" width="50" height="50" border="0">
					</button>
				</td>								
			</tr>			
		</table>
	</div>
	<a href="menuAsignatura" cssClass="Navegador"><img src="resources/img/alumno.jpg" width="50" height="50" border="0" />Ir a Menu Asignatura</a>
</body>
</html>