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
function editar(int_idcurso){
	location.replace("editAsignatura?int_idcurso="+int_idcurso);
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
	<h2 class="Titulo">Datos de Asignatura</h2>
	<hr>
		<div id="divView">
		<table>
			<tr>
				<td>C&oacute;digo:</td>
				<td>${asignatura.int_idcurso}</td>
			</tr>
			<tr>
				<td>Nombre:</td>
				<td>${asignatura.str_curso}</td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td>					
					<c:if test="${asignatura.int_idestado==1}">Activo</c:if>
					<c:if test="${asignatura.int_idestado==2}">Inactivo</c:if>
				</td>
			</tr>
			<tr>
				<td>
					<button title="Editar" onclick="javascript:editar('${asignatura.int_idcurso}')">
						<img src="resources/img/Editar.png" width="50" height="50" border="0">
					</button>
				</td>								
			</tr>			
		</table>
	</div>
	<a href="listAsignatura" cssClass="Navegador"><img src="resources/img/cursos.jpg" width="50" height="50" border="0" />Ir a Mantenimiento Asignatura</a>
</body>
</html>