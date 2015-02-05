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
			<td><img src="resources/img/logoConsultisoft.png" width="350" height="100" border="0"></td>
		</tr>
	</table>
	<hr>
	<h3 class="Titulo">Mantenimiento Curr&iacute;cula</h3>
    <hr>
        
         <form:form action="findCurricula" method="post" commandName="curricula" >
         
            <table width="400" >
            	<tr>
					<td width="100">Curr&iacute;cula:</td>
					<td width="300"><form:input	path="str_curricula" /></td>
				</tr>
			</table>
			<table>
                <tr>
                    <td>
                    	<br>
                    	<button type="submit" title="Buscar curricula">
                            <img src="resources/img/Buscar.png" width="50" height="50" border="0">
                        </button>
                        <a href="formCurricula" cssClass="Navegador"><img src="resources/img/curricula.jpg" width="50" height="50" border="0" title="Nueva curricula"></a>
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
		name="listCurriculas" 
		requestURI="listCurricula">

		<display:setProperty name="export.excel.filename" value="Curricula.xls" />
		<display:setProperty name="export.pdf" value="false" />
		<display:setProperty name="export.xml" value="false" />
		<display:setProperty name="export.csv" value="false" /> 

		<display:column value="${fila_rowNum}" title="Nro." />
		<display:column property="str_curricula" title="Curricula" sortable="true"	style="width:300px " />
		<display:column property="dte_fecha_creacion" title="Fec. Creación" sortable="true" style="width:200px" />
		<display:column property="dte_fecha_modificacion" title="Fec. Modificación" sortable="true" style="width:200px" />
		<display:column title="Estado">
			<c:if test="${fila.estado=='A'}">Activo</c:if>
			<c:if test="${fila.estado=='I'}">Inactivo</c:if>
		</display:column>
		<display:column media="html" title="Ver" style="text-align:center;">
			<a href="viewCurricula?int_idcurricula=${fila.int_idcurricula}"><img src="resources/img/Buscar.png" alt="Ver" height="20" width="20"></a>
		</display:column>

		<display:column media="html" title="Eliminar" style="text-align:center;">
			<a href="JavaScript:eliminar('${fila.str_curricula}', 'deleteCurricula?int_idcurricula=${fila.int_idcurricula}')"><img src="resources/img/Borrar.png" alt="Ver" height="20" width="20"></a>
		</display:column>
	</display:table>

	<br>
	<a href="moduloCursos" cssClass="Navegador"><img src="resources/img/cursos.jpg" width="50" height="50" border="0" />Ir a Men&uacute; Principal</a>
</body>
</html>