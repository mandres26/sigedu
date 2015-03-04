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
function editar(int_iddocente){
	location.replace("editDocente?codigo="+int_iddocente);
	//alert("hola");
}
</script>
<title>SIGEDU</title>
</head>

<body>
	<h2 class="Titulo">Datos de Docente</h2>
	<hr>
		<div id="divView">
		<table>
			<tr>
				<td>C&oacute;digo:</td>
				<td>${docente.int_iddocente}</td>
			</tr>
			<tr>
				<td>Nombres:</td>
				<td>${docente.str_nombre}</td>
			</tr>
			<tr>
				<td>Ap.Paterno</td>
				<td>${docente.str_apellido_paterno}</td>
			</tr>
			<tr>
				<td>Ap. Materno:</td>
				<td>${docente.str_apellido_materno}</td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td>					
					<c:if test="${docente.int_idestado==1}">Activo</c:if>
					<c:if test="${docente.int_idestado==2}">Inactivo</c:if>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
				<td>
					<button title="Editar" onclick="javascript:editar('${docente.int_iddocente}')">
						<img src="resources/img/Editar.png" width="50" height="50" border="0">
					</button>
				</td>								
			</tr>			
		</table>
	</div>
	<a href="listDocentes" cssClass="Navegador"><img src="resources/img/docente.jpg" width="50" height="50" border="0" />Ir a Mantenimiento Docente</a>
</body>
</html>