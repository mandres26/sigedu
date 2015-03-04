<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/validacion.css" title="validacion" type="text/css">
<link rel="stylesheet" href="resources/css/links.css" title="links" type="text/css">
<link rel="stylesheet" href="resources/css/mensajes.css" type="text/css">
<link rel="stylesheet" href="resources/css/controles.css" type="text/css">
<link rel="stylesheet" href="resources/css/menu_style.css" type="text/css">
<link rel="stylesheet" href="resources/css/titulos.css" type="text/css">
<title>SIGEDU</title>
</head>
<body>
	<table width="1600" align="center">
		<tr>
			<td><img src="resources/img/logoConsultisoft.png" width="350" height="100" border="0"></td>
		</tr>
	</table>
	<hr width="1600">
	<h1 class="Titulo" align="center" width="1400">Editar Diseño Curricular Nacional</h1>
	<hr width="1600">
	
	<table width="1600" align="center" >
	<tr>
		<td>
			<table width="250" >
			<tr >
				<td >
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
			<c:if test="${resultado==0}">
			<h3 class="MensajeExito">
			</c:if>
			<c:if test="${resultado!=0}">
				<h3 class="MensajeError">
			</c:if>
				${mensaje}
		    </h3>
			<form:form method="post" action="updateDcn" commandName="dcn">
		
			<table width="600" align="center">
				<tr>
					<td width="200">C&oacute;digo:</td>
					<td width="400"><form:input	path="codigo" readonly="true" size="30"/></td>
				</tr>
				<tr>
					<td width="200">Nombre DCN:</td>
					<td width="400"><form:errors path="str_dcn" cssClass="error" /><br> <form:input
							path="str_dcn" size="50" /></td>
				</tr>
				<tr>
					<td width="200">Fecha inicio vigencia:</td>
					<td width="400"><form:errors path="dte_fecha_inicio_vig" cssClass="error" /><br> <form:input
							path="dte_fecha_inicio_vig" /></td>
				</tr>
				<tr>
					<td width="200">Fecha fin vigencia:</td>
					<td width="400"><form:errors path="dte_fecha_fin_vig" cssClass="error" /><br> <form:input
							path="dte_fecha_fin_vig" /></td>
				</tr>
				<tr>
					<td width="200">Fecha creaci&oacute;n:</td>
					<td width="400"><form:errors path="dte_fecha_creacion" cssClass="error" /><br> <form:input
							path="dte_fecha_creacion" /></td>
				</tr>
				<tr>
					<td width="200">Fecha modificaci&oacute;n:</td>
					<td width="400"><form:errors path="dte_fecha_modificacion" cssClass="error" /><br> <form:input
							path="dte_fecha_modificacion" /></td>
				</tr>
				<tr>
					<td width="200">Modalidad:</td>
					<td width="400"><form:errors path="" cssClass="error" /><br> <form:input
							path="" /></td>
				</tr>
				<tr>
					<td width="200">Tipo de Centro:</td>
					<td width="400"><form:errors path="" cssClass="error" /><br> <form:input
							path="" /></td>
				</tr>
				<tr>
					<td width="200">Estado:</td>
					<td width="400"><form:radiobutton path="int_idestado" value="1" />Activo 
						&nbsp;
						<form:radiobutton path="int_idestado" value="2" />Inactivo
						&nbsp;
						<form:radiobutton path="int_idestado" value="2" />Cerrado
						</td>
				</tr>
			</table>
			<br>
			<table width="600" align="center">	
				<tr>
					<td align="right">
						<button type="reset" title="Limpiar">
							<img src="resources/img/Borrar.png" width="50" height="50" border="0">
						</button>
					</td>
					<td align="left">
						<button type="submit" title="Grabar">
							<img src="resources/img/Grabar.png" width="50" height="50" border="0">
						</button>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	</table>
	<br>
	<hr width="1600" align="center">
		
	</form:form>
	<table width="1600" align="center">
	<tr>
		<td>
			<a href="listDcn" cssClass="Navegador"><img src="resources/img/alumno.jpg" width="50" height="50" border="0" />Ir a Mantenimiento DCN</a>	
		</td>
		
	</tr>
	</table>
    
</body>
</html>