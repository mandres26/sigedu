<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/links.css" title="links" type="text/css">
<link rel="stylesheet" href="resources/css/titulos.css" type="text/css">
<link rel="stylesheet" href="resources/css/menu_style.css" type="text/css">
<title>Sistema de Gesti&oacute;n Educativa - SIGEDU</title></head>

<body>
	<table width="1440" align="center">
	<tr>
		<td width="350"><img src="resources/img/logoConsultisoft.png"  height="100" border="0"></td>
	</tr>
	</table>		
	
	<hr width="1440">
	
	<div id="header" align="center">
		<%@include file="../commons/header.jsp"%>
	</div>

	<hr width="1440">
	
	<table width="1400" align="center">
	<tr>
		<td>
			<table width="200" >
			<tr >
				<td>
					<ul class="menu">
						<li><a href="#">Administrativo</a>
							<ul>
								<li><a href="#"></>Asistencia de alumno</a></li>
								<li><a href="#"></>Cuaderno de control</a></li>
								<li><a href="#"></>Docentes</a></li>
							</ul>
						</li>
						<li><a href="#">Cursos</a>
							<ul>
								<li><a href="listColegio"></>Colegio</a></li>
								<li><a href="listIe"></>Instituci&oacute;n Educativa</a></li>
								<li><a href="listDcn"></>Diseño Curricular</a></li>
								<li><a href="listPlc"></>Plan Curricular</a></li>
								<li><a href="#"></>Apertura IE</a></li>
								<li><a href="#"></>Apertura Per&iacute;odo Lectivo</a></li>
							</ul>
						</li>
						<li><a href="#">Matr&iacute;cula</a>
							<ul>
								<li><a href="#"></>Alumnos</a></li>
								<li><a href="#"></>Aulas</a></li>
								<li><a href="#"></>Matr&iacute;cula</a></li>
								<li><a href="#"></>Nómina de Alumnos matriculados</a></li>
							</ul>
						</li>
						<li><a href="#">Notas</a>
							<ul>
								<li><a href="#"></>Notas de alumnos</a></li>
								<li><a href="#"></>Acta de evaluaciones</a></li>
								<li><a href="#"></>Record de notas</a></li>
								<li><a href="#"></>Libreta de notas</a></li>
							</ul>
						</li>
						<li><a href="#">Pagos</a>
							<ul>
								<li><a href="#"></>Pensi&oacute;n del alumno</a></li>
								<li><a href="#"></>Alumnos morosos</a></li>
								<li><a href="#"></>Alertas de pagos</a></li>
							</ul>
						</li>
						<li><a href="#">Reportes</a>
							<ul>
								<li><a href="#"></>Reporte de alumnos</a></li>
								<li><a href="#"></>Reporte de pagos</a></li>
							</ul>
						</li>
					</ul>	
				</td>
			</tr>
			</table>
		</td>
		<td>
			<table width="1000" align="center">
				<tr>
					<td><b>Generalidades</b></td>
				</tr>
				<tr>
					<td><a href="listIe" cssClass="Navegador">
						<img src="resources/img/colegio.jpg" width="90" height="90" border="0" />
						Institución Educativa</a></td>
					<td>&nbsp;</td>
					<td><a href="listDcn" cssClass="Navegador">
						<img src="resources/img/disenocurri.jpg" width="90" height="90" border="0" />
						Diseño Curricular</a></td>
					<td>&nbsp;</td>
					<td><a href="listPlc" cssClass="Navegador">
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
			<table width="1000" align="center">
				<tr>
					<td><b>M&oacute;dulos</b></td>
				</tr>
				<tr>
					<td><a href="listColegio" cssClass="Navegador">
						<img src="resources/img/colegio.jpg" width="90" height="90" border="0" />Colegio</a></td>
					<td>&nbsp;</td>
					
					<td><a href="listAsignatura" cssClass="Navegador"><img
							src="resources/img/asignatura.jpg" width="90" height="90" border="0" />Asignatura</a></td>
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
				
			</table>	
		</td>
	</tr>
	</table>	
	<table align="center">
			<tr>
				<td colspan="5" align="center"><a href="moduloPrincipal"
					cssClass="Navegador"><img src="resources/img/home.png"
						width="50" height="50" border="0" />Ir a M&oacute;dulo Principal</a></td>
			</tr>
	</table>
	
	<div id="footer">
		<%@include file="../commons/footer.jsp"%>
	</div>

</body>
</html>