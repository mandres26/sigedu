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
		<%@include file="../commons/header.jsp"%>
	</div>

	<div align="center">
		<table>
			<tr>
				<td colspan="5">&nbsp;</td>
			</tr>
			<tr>
				<td><a href="menuMatricula" cssClass="Navegador"><img
						src="resources/img/matricula.jpg" width="100" height="100"
						border="0" />Matr&iacute;culas</a></td>
				<td>&nbsp;</td>
				<td><a href="menuAlumno" cssClass="Navegador"><img
						src="resources/img/alumno.jpg" width="100" height="100" border="0" />Alumnos</a></td>
				<td>&nbsp;</td>
				<td><a href="menuAula" cssClass="Navegador"><img
						src="resources/img/aula.jpg" width="100" height="100" border="0" />Aulas</a></td>

			</tr>
			<tr>
				<td colspan="5">&nbsp;</td>
			</tr>
			<tr>

				<td colspan="5" align="center"><a href="moduloPrincipal"
					cssClass="Navegador"><img src="resources/img/home.png"
						width="50" height="50" border="0" />Ir a M&oacute;dulo Principal</a></td>

			</tr>

		</table>
	</div>
	<div id="footer">
		<%@include file="../commons/footer.jsp"%>
	</div>

</body>
</html>