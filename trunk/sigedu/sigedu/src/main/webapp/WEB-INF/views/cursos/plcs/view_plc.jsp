<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/titulos.css" type="text/css">
<script language="JavaScript" type="text/javascript">
function editar(int_idplc){
	location.replace("editPlc?int_idplc="+int_idplc);
	//alert("hola");
}
</script>

<title>SIGEDU</title>
</head>

<body>
	<table width="1400" align="center">
		<tr>
			<td ><img src="resources/img/logoConsultisoft.png" width="350" height="100" border="0"></td>
		</tr>
	</table>	
	<hr width="1400">
	
	<h1 class="Titulo" align="center" width="1400">Datos del Plan Curricular</h1>
	<hr width="1400">
	
		<div id="divView">
		<table width="1400" align="center">
			<tr>
				<td width="150">C&oacute;digo:</td>
				<td width="800">${plc.int_idplc}</td>
			</tr>
			<tr>
				<td width="150">Nombre PLC:</td>
				<td width="800">${plc.str_plc}</td>
			</tr>
			<tr>
				<td width="150">Fecha Inicio:</td>
				<td width="800">${plc.dte_fecha_inicio}</td>
			</tr>
			<tr>
				<td width="150">Fecha Fin:</td>
				<td width="800">${plc.dte_fecha_fin}</td>
			</tr>
			
			<tr>
				<td width="150">Estado:</td>
				<td width="800">					
					<c:if test="${plc.int_idestado==1}">Activo</c:if>
					<c:if test="${plc.int_idestado==2}">Inactivo</c:if>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
				<td>
					<button title="Editar" onclick="javascript:editar('${plc.int_idplc}')">
						<img src="resources/img/Editar.png" width="50" height="50" border="0">
					</button>
				</td>								
			</tr>			
		</table>
	</div>
	<br>
	<hr>
	<br>
	
	<table width="1400" align="center">
	<tr>
		<td>
			<a href="listPlc" cssClass="Navegador"><img src="resources/img/colegio.jpg" width="50" height="50" border="0" />Ir a Mantenimiento PLC</a>		
		</td>
	</tr>
	</table>	
	
</body>
</html>