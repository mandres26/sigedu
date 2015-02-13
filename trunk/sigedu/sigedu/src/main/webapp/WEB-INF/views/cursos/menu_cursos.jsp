<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/links.css" title="links" type="text/css">
<link rel="stylesheet" href="resources/css/titulos.css" type="text/css">
<title>Sistema de Gesti&oacute;n Educativa - SIGEDU</title></head>

<body>
	<div id="header" align="center">
		<%@include file="../commons/header.jsp"%>
	</div>

	<hr width="1440">
	
	<div align="center">
		<table width="1200" align="center">
			<tr>
				<td colspan="5">&nbsp;</td>
			</tr>
			<tr>
				<td><p><b>Generalidades</b></p></td>
			</tr>
			<tr>
				<td><a href="listColegio" cssClass="Navegador">
					<img src="resources/img/colegio.jpg" width="90" height="90" border="0" />
					Instituci�n Educativa</a></td>
				<td>&nbsp;</td>
				<td><a href="listColegio" cssClass="Navegador">
					<img src="resources/img/disenocurri.jpg" width="90" height="90" border="0" />
					Dise�o Curricular</a></td>
				<td>&nbsp;</td>
				<td><a href="listColegio" cssClass="Navegador">
					<img src="resources/img/plancurri.jpg" width="90" height="90" border="0" />
					Plan Curricular</a></td>
				<td>&nbsp;</td>
			<tr>
				<td><a href="listColegio" cssClass="Navegador">
					<img src="resources/img/colegio.jpg" width="90" height="90" border="0" />
					Apertura de Per&iacute;odo Lectivo</a></td>
				<td>&nbsp;</td>
				<td><a href="listColegio" cssClass="Navegador">
					<img src="resources/img/colegio.jpg" width="90" height="90" border="0" />
					Apertura de Instituci&oacute;n Educativa</a></td>
				<td>&nbsp;</td>
			</tr>
		</table>
		<br>
		<hr>
		<table width="1200" align="center">
			<tr>
				<td colspan="5">&nbsp;</td>
			</tr>
			<tr>
				<td><p><b>M&oacute;dulos</b></p></td>
			</tr>
			<tr>
				<td><a href="listColegio" cssClass="Navegador">
					<img src="resources/img/colegio.jpg" width="90" height="90" border="0" />Colegio</a></td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				
				<td><a href="listAsignatura" cssClass="Navegador"><img
						src="resources/img/asignatura.jpg" width="90" height="90" border="0" />Asignatura</a></td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				
				<td><a href="listCurricula" cssClass="Navegador"><img
						src="resources/img/curricula.jpg" width="90" height="90" border="0" />Curricula</a></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><a href="menuHorario" cssClass="Navegador"><img
						src="resources/img/horario.jpg" width="90" height="90" border="0" />Horario</a></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="5">&nbsp;</td>
			</tr>
			<tr>
				<td colspan="5">&nbsp;</td>
			</tr>
		</table>
		<table>
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