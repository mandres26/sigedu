<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/displayTag.css" title="displayTag" type="text/css">
<link rel="stylesheet" href="resources/css/mensajes.css" type="text/css">
<link rel="stylesheet" href="resources/css/titulos.css" type="text/css">
<script language="JavaScript" type="text/javascript" src="resources/js/funciones.js"></script>
<title>SIGEDU</title>
</head>
<body>

	<table>
		<tr>
			<td><img src="resources/img/logo.png" width="350" height="100" border="0"></td>
		</tr>
	</table>
	<hr>
	<h2 class="Titulo">Mantenimiento de Docentes</h2>
    <hr>
        
         <form:form action="findDocente" method="post" commandName="docente" >
            
            <table>
            	<tr>
					<td>Nombres:</td>
					<td><form:input	path="str_nombre" /></td>
				</tr>
				<tr>
					<td>Ap.Paterno</td>
					<td><form:input	path="str_apellido_paterno" /></td>
				</tr>
				<tr>
					<td>Ap. Materno:</td>
					<td><form:input	path="str_apellido_materno" /></td>
				</tr>
            </table>
			<table>	
                <tr>
                    <td>
                       <br>
                        <button type="submit" title="Buscar docente">
                            <img src="resources/img/Buscar.png" width="50" height="50" border="0">
                        </button>
                        <a href="formDocente" cssClass="Navegador"><img src="resources/img/docente.jpg" width="50" height="50" border="0" title="Nuevo docente"></a>
    					<br>
                    </td>
                </tr>
            </table>
			
        </form:form>
    <hr>
	
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
    <br>
    <display:table 
		id="fila"
		export="true" 
		pagesize="10" 
		name="listDocentes" 
		requestURI="listDocente">

		<display:setProperty name="export.excel.filename" value="Docente.xls" />
		<display:setProperty name="export.pdf" value="false" />
		<display:setProperty name="export.xml" value="false" />
		<display:setProperty name="export.csv" value="false" /> 

		<display:column value="${fila_rowNum}" title="Nro." />
		<display:column property="str_nombre" title="Nombres" sortable="true"	style="width:300px " />
		<display:column property="str_apellido_paterno" title="Ap.Paterno" sortable="true" style="width:200px" />
		<display:column property="str_apellido_materno" title="Ap.Materno" sortable="true" style="width:200px" />
		<display:column title="Estado">
			<c:if test="${fila.int_idestado==1}">Activo</c:if>
			<c:if test="${fila.int_idestado==2}">Inactivo</c:if>
		</display:column>
		<display:column media="html" title="Ver" style="text-align:center;">
			<a href="editDocente?codigo=${fila.int_iddocente}"><img src="resources/img/Buscar.png" alt="Ver" height="20" width="20"></a>
		</display:column>

		<display:column media="html" title="Eliminar" style="text-align:center;">
			<a href="JavaScript:eliminar('${fila.str_nombre}'+' '+'${fila.str_apellido_paterno}'+' '+'${fila.str_apellido_materno}', 'deleteDocente?codigo=${fila.int_iddocente}')"><img src="resources/img/Borrar.png" alt="Ver" height="20" width="20"></a>
		</display:column>
	</display:table>

	<br>
	<hr>
	<br>
	<a href="moduloAdministrativo" cssClass="Navegador"><img src="resources/img/administrativo.jpg" width="50" height="50" border="0" />Ir a M&oacute;dulo Administrativo</a>
</body>
</html>