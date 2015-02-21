<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/links.css" title="links"
	type="text/css">
<link rel="stylesheet" href="resources/css/titulos.css" type="text/css">
<title>Sistema de Gesti&oacute;n Educativa - SIGEDU</title>
</head>
<body>
	
	<div id="header" align="center">
		<%@include file="commons/header.jsp"%>
	</div>
	<div align="center">
		<table>
			<tr>
				<td></td>
				<td><a href="moduloPagos" cssClass="Navegador"><img
						src="resources/img/pagos.jpg" width="100" height="100" border="0" />Pagos</a></td>
				<td></td>
				<td><a href="moduloMatriculas" cssClass="Navegador"><img
						src="resources/img/matricula.jpg" width="100" height="100" border="0" />Matr&iacute;cula</a></td>
				<td></td>
			</tr>
			<tr>
				<td><a href="moduloCursos" cssClass="Navegador"><img
						src="resources/img/cursos.jpg" width="100" height="100" border="0" />Cursos</a></td>
				<td></td>
				<td><img src="resources/img/centro.jpg" border="0" /></td>
				<td></td>
				<td><a href="moduloAdministrativo" cssClass="Navegador"><img
						src="resources/img/administrativo.jpg" width="100" height="100" border="0" />Administrativo</a></td>
			</tr>
			<tr>
				<td></td>
				<td><a href="moduloNotas" cssClass="Navegador"><img
						src="resources/img/notas.jpg" width="100" height="100" border="0" />Notas</a></td>
				<td></td>
				<td><a href="moduloReportes" cssClass="Navegador"><img
						src="resources/img/reportes.jpg" width="100" height="100" border="0" />Reportes</a></td>
				<td></td>
			</tr>

		</table>
	</div>
	<div id="footer">
		<%@include file="commons/footer.jsp"%>
	</div>
</body>
</html>