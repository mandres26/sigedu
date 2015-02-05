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
function editar(int_idcurricula){
	location.replace("editCurricula?int_idcurricula="+int_idcurricula);
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
	<h2 class="Titulo">Datos de Curr&iacute;cula</h2>
	<hr>
		<div id="divView">
		<table>
			<tr>
				<td>C&oacute;digo:</td>
				<td>${curricula.int_idcurricula}</td>
			</tr>
			<tr>
				<td>Curr&iacute;cula:</td>
				<td>${curricula.str_curricula}</td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td>					
					<c:if test="${curricula.int_idestado==1}">Activo</c:if>
					<c:if test="${curricula.int_idestado==2}">Inactivo</c:if>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
				<td>
					<button title="Editar" onclick="javascript:editar('${curricula.int_idestado}')">
						<img src="resources/img/Editar.png" width="50" height="50" border="0">
					</button>
				</td>								
			</tr>			
		</table>
	</div>
	<a href="listCurricula" cssClass="Navegador"><img src="resources/img/curricula.jpg" width="50" height="50" border="0" />Ir a Mantenimiento Curr&iacute;cula</a>
</body>
</html>