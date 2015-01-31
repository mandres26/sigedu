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
	<h3 class="Titulo">Buscar Colegios</h3>
    <hr>
        
         <form:form action="findColegio" method="post" commandName="colegio" >
            <table>
            	<tr>
					<td>Nombre Colegio:</td>
					<td><form:input	path="nombre" /></td>
				</tr>
				<tr>
					<td>Tel&eacute;fono 1:</td>
					<td><form:input	path="telefono1" /></td>
				</tr>
				<tr>
					<td>Tel&eacute;fono 2:</td>
					<td><form:input	path="telefono2" /></td>
				</tr>
				<tr>
					<td>Celular:</td>
					<td><form:input	path="celular" /></td>
				</tr>
            	<tr>
					<td>Direcci&oacute;n:</td>
					<td><form:input	path="direccion" /></td>
				</tr>
                <tr>
                    <td>
                        <button type="submit" title="Buscar colegio">
                            <img src="resources/img/Buscar.png" width="50" height="50" border="0">
                        </button>
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
		name="listColegios" 
		requestURI="listColegio">

		<display:setProperty name="export.excel.filename" value="Colegio.xls" />
		<display:setProperty name="export.pdf" value="false" />
		<display:setProperty name="export.xml" value="false" />
		<display:setProperty name="export.csv" value="false" /> 

		<display:column value="${fila_rowNum}" title="Nro." />
		<display:column property="nombre" title="Nombre" sortable="true" style="width:300px " />
		<display:column property="telefono1" title="Teléfono 1" sortable="true" style="width:200px" />
		<display:column property="telefono2" title="Teléfono 2" sortable="true" style="width:200px" />
		<display:column property="celular" title="Celular" sortable="true" style="width:200px" />
		<display:column property="direccion" title="Dirección" sortable="true" style="width:200px" />
		
		<display:column title="Estado">
			<c:if test="${fila.estado=='A'}">Activo</c:if>
			<c:if test="${fila.estado=='I'}">Inactivo</c:if>
		</display:column>
		<display:column media="html" title="Ver" style="text-align:center;">
			<a href="viewColegio?codigo=${fila.codigo}"><img src="resources/img/Buscar.png" alt="Ver" height="20" width="20"></a>
		</display:column>

		<display:column media="html" title="Eliminar" style="text-align:center;">
			<a href="JavaScript:eliminar('${fila.nombre}', 'deleteColegio?codigo=${fila.codigo}')"><img src="resources/img/Borrar.png" alt="Ver" height="20" width="20"></a>
		</display:column>
	</display:table>

	<br>
	<a href="menuColegio" cssClass="Navegador"><img src="resources/img/alumno.jpg" width="50" height="50" border="0" />Ir a Men&uacute; Colegio</a>
</body>
</html>