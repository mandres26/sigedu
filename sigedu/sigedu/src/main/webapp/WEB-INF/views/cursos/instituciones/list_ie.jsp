<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>

<html lang="es">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/displayTag.css" title="displayTag" type="text/css">
<link rel="stylesheet" href="resources/css/mensajes.css" type="text/css">
<link rel="stylesheet" href="resources/css/titulos.css" type="text/css">
<link rel="stylesheet" href="resources/css/menu_style.css" type="text/css">
<script language="JavaScript" type="text/javascript" src="resources/js/funciones.js"></script>
<title>SIGEDU</title>
</head>
<body>
	<table width="1600" align="center">
		<tr>
			<td ><img src="resources/img/logoConsultisoft.png" width="350" height="100" border="0"></td>
		</tr>
	</table>	
	<hr width="1600">
	
	<h1 class="Titulo" align="center" width="1400">Mantenimiento de Instituci&oacute;n Educativa</h1>
	
	<hr width="1600">
	
	<table width="1600" align="center">
	<tr>
		<td>
			<table width="250"  >
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
								<li><a href="#"></>Plan Curricular</a></li>
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
			<table width="1200" align="center" >
			<tr>
				<td >
					
				         <form:form action="findIe" method="post" commandName="ie" >
				            <br>
				            <table width="450" align="center" >
				            	<tr>
									<td width="100">Cod. Modular:</td>
									<td width="350"><form:input	path="str_codigo_modular" size="40" /></td>
								</tr>
								<tr>
									<td>
										&nbsp;
									</td>
								</tr>
								<tr>
									<td width="100">Cod. Local:</td>
									<td width="350"><form:input	path="str_codigo_local" size="40" /></td>
								</tr>
							</table>
							<br>
							<table align="center">	
				                <tr>
				                    <td>
				                    	<button type="submit" title="Buscar Institución Educativa">
				                            <img src="resources/img/Buscar.png" width="50" height="50" border="0">
				                        </button>
				                    </td>
				                    <td>
				                    	&nbsp;
				                    </td>
				                    <td> 
				                    	<a href="formIe" cssClass="Navegador"><img src="resources/img/colegio.jpg" width="50" height="50" border="0" title="Registrar nueva institución educativa"></a>
				                    </td>
				                </tr>
				            </table>
				        </form:form>
				        
				    <hr width="1300">
					
					
					<c:if test="${resultado==0}">
						<h3 class="MensajeExito">
					</c:if>
					<c:if test="${resultado!=0}">
						<h3 class="MensajeError">
					</c:if>
						${mensaje}
				    </h3>
				    <display:table 
						id="fila"
						export="true" 
						pagesize="10" 
						name="listIes" 
						requestURI="listIe">
				
						<display:setProperty name="export.excel.filename" value="Ie.xls" />
						<display:setProperty name="export.pdf" value="false" />
						<display:setProperty name="export.xml" value="false" />
						<display:setProperty name="export.csv" value="false" /> 
				
						<display:column value="${fila_rowNum}"  title="Nro." />
						<display:column property="str_codigo_modular"   title="Cod. Modular"  sortable="true" style="width:100px" />
						<display:column property="str_codigo_local"   title="Cod. Local"  sortable="true" style="width:100px" />
						<display:column property="str_ie"   title="Nombre IE"  sortable="true" style="width:300px" />
						<display:column property="str_pagina_web"  title="Pagina web"  sortable="true" style="width:300px" />
						<display:column property="str_res_autorizacion_func"   title="Res. Autorizacion Func."  sortable="true" style="width:150x" />
						<display:column  title="Estado">
							<c:if test="${fila.int_idestado==1}">Activo</c:if>
							<c:if test="${fila.int_idestado==2}">Inactivo</c:if>
						</display:column>
						<display:column media="html" title="Ver" style="text-align:center;">
							<a href="viewIe?codigo=${fila.codigo}"><img src="resources/img/Buscar.png" alt="Ver" height="20" width="20"></a>
						</display:column>
						<display:column media="html" title="Editar" style="text-align:center;">
							<a href="editIe?codigo=${fila.codigo}"><img src="resources/img/Editar.png" alt="Edit" height="20" width="20"></a>
						</display:column>
				
						<display:column media="html" title="Eliminar" style="text-align:center;">
							<a href="JavaScript:eliminar('${fila.str_ie}', 'deleteIe?codigo=${fila.codigo}')"><img src="resources/img/Borrar.png" alt="Ver" height="20" width="20"></a>
						</display:column>
					</display:table>
					<br>
					<table align="center">
					<tr>
						<td><a href="" ><img src="resources/img/Anterior.png" width="30" height="30" border="0" title="Anterior"></a></td>
						<td><a href="" ><img src="resources/img/Primero.png" width="30" height="30" border="0" title="Primero"></a></td>
						<td>1 de 4</td>
						<td><a href="" ><img src="resources/img/Ultimo.png" width="30" height="30" border="0" title="Ultimo"></a></td>
						<td><a href="" ><img src="resources/img/Siguiente.png" width="30" height="30" border="0" title="Siguiente"></a></td>
					</tr>
					</table>
				
				</td>
			</tr>
			</table>
		</td>
	</tr>
	</table>
	
	<br>
	<hr width="1600">
	<br>
	
	<table width="1600" align="center">
	<tr>
		<td>
			<a href="moduloCursos" cssClass="Navegador"><img src="resources/img/cursos.jpg" width="50" height="50" border="0" />Ir a Men&uacute; Cursos</a>	
		</td>
	</tr>
	</table>	
</body>
</html>