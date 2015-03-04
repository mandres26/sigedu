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
	<h2 class="Titulo">Busqueda de Cursos</h2>
    <hr>
        
         <form:form action="findAsignatura" method="post" commandName="asignatura" >
            <br>
            <table width="400" >
            	<tr>
					<td width="100">Asignatura:</td>
					<td width="300"><form:input	path="str_curso" size="50" /></td>
				</tr>
			</table>
			<table>	
                <tr>
                    <td>
                    	<br>
                        <button type="submit" title="Buscar asignatura">
                            <img src="resources/img/Buscar.png" width="50" height="50" border="0">
                        </button>
                        <a href="formAsignatura" cssClass="Navegador"><img src="resources/img/asignatura.jpg" width="50" height="50" border="0" title="Nueva asignatura"></a>
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
		name="listCursos" 
		requestURI="listAsignatura">

		<display:setProperty name="export.excel.filename" value="Asignatura.xls" />
		<display:setProperty name="export.pdf" value="false" />
		<display:setProperty name="export.xml" value="false" />
		<display:setProperty name="export.csv" value="false" /> 

		<display:column value="${fila_rowNum}" title="Nro." />
		<display:column property="str_curso" title="Asignatura" sortable="true" style="width:400px " />
		<display:column property="dte_fecha_creacion" title="Fec. Creación" sortable="true" style="width:200px" />
		<display:column property="dte_fecha_modificacion" title="Fec. Modificación" sortable="true" style="width:200px" />

		
		<display:column title="Estado">
			<c:if test="${fila.int_idestado==1}">Activo</c:if>
			<c:if test="${fila.int_idestado==2}">Inactivo</c:if>
		</display:column>
		<display:column media="html" title="Ver" style="text-align:center;">
			<a href="viewAsignatura?int_idcurso=${fila.int_idcurso}"><img src="resources/img/Buscar.png" alt="Ver" height="20" width="20"></a>
		</display:column>

		<display:column media="html" title="Eliminar" style="text-align:center;">
			<a href="JavaScript:eliminar('${fila.str_curso}', 'deleteAsignatura?int_idcurso=${fila.int_idcurso}')"><img src="resources/img/Borrar.png" alt="Ver" height="20" width="20"></a>
		</display:column>
	</display:table>

	<br>
	<hr>
	<br>
	<a href="moduloNotas" cssClass="Navegador"><img src="resources/img/notas.jpg" width="50" height="50" border="0" />Ir a M&oacute;dulo Notas</a>
</body>
</html>