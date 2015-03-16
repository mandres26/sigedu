<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url var="listarProvinciasPorDepartamentoURL"
	value="/listarProvincias" />

<c:url var="listarDistritosPorProvinciaURL"
	value="/listarDistritos" />


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/validacion.css" title="validacion" type="text/css">
<link rel="stylesheet" href="resources/css/links.css" title="links" type="text/css">
<link rel="stylesheet" href="resources/css/mensajes.css" type="text/css">
<link rel="stylesheet" href="resources/css/controles.css" type="text/css">
<link rel="stylesheet" href="resources/css/titulos.css" type="text/css">

<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<link rel="stylesheet"
	href="resources/js/jquery-ui-1.8.16/themes/base/jquery-ui.css"
	type="text/css" />
<link rel="stylesheet"
	href="resources/js/jquery-ui-1.8.16/themes/base/jquery.ui.autocomplete.css"
	type="text/css" />
<script src="resources/js/jquery-ui-1.8.16/jquery-1.6.2.js"></script>
<script type="text/javascript"
	src="resources/js/jquery-ui-1.8.16/ui/jquery-ui.js"></script>
<script type="text/javascript"
	src="resources/js/jquery-ui-1.8.16/ui/jquery.ui.core.js"></script>
<script type="text/javascript"
	src="resources/js/jquery-ui-1.8.16/ui/jquery.ui.position.js"></script>
<script type="text/javascript"
	src="resources/js/jquery-ui-1.8.16/ui/jquery.ui.widget.js"></script>

<title>SIGEDU</title>
</head>
<body>
	<script type="text/javascript">
		$(document)
				.ready(
						function() {												
							
							$("#departamento")
									.change(
											function() {
												$.ajax({
															type : "GET",
															contentType : "application/json",
															dataType : "json",
															url : "${listarProvinciasPorDepartamentoURL}", //url to get list of json data.
															data : ({
																idDepartamento : $(
																		this)
																		.val()
															}),
															success : function(
																	data) {
																var html = '<option value="">-- Selecione Provincia --'
																		+ '</option>';
																var len = data.length;
																for (var i = 0; i < len; i++) {
																	html += '<option value="' + data[i].id + '">'
																			+ data[i].nombre
																			+ '</option>';
																}
																html += '</option>';
																$('#provincia').html(html);

																html = '<option value="">-- Selecione Distrito --</option>';
																$('#distrito').html(html);
															},
															error : function(xhr, ajaxOptions, thrownError) {
																alert("Error:"+ xhr.status	+ ", "	+ thrownError);

															}

														});
											});


							$("#provincia")
							.change(
									function() {
										$.ajax({
													type : "GET",
													contentType : "application/json",
													dataType : "json",
													url : "${listarDistritosPorProvinciaURL}", //url to get list of json data.
													data : ({
														idProvincia : $(
																this)
																.val()
													}),
													success : function(
															data) {
														var html = '<option value="">-- Selecione Distrito --'
																+ '</option>';
														var len = data.length;
														for (var i = 0; i < len; i++) {
															html += '<option value="' + data[i].id + '">'
																	+ data[i].nombre
																	+ '</option>';
														}
														html += '</option>';
														$('#distrito').html(html);
													},
													error : function(xhr, ajaxOptions, thrownError) {
														alert("Error:" + xhr.status + ", " + thrownError);

													}

												});
									});

							
						});//Fin de function ready
	</script>

    <table>
		<tr>
			<td><img src="resources/img/logo.png" width="350" height="100" border="0"></td>
		</tr>
	</table>
	<hr>
	<h2 class="Titulo">Nuevo Docente</h2>
	<hr>
	
	<c:if test="${resultado==0}">
		<h3 class="MensajeExito">
	</c:if>
	<c:if test="${resultado!=0}">
		<h3 class="MensajeError">
	</c:if>
		${mensaje}
    </h3>
	<form:form method="post" action="addDocente" commandName="docente">

		<table>
			<tr>
				<td>Nombres:</td>
				<td><form:errors path="str_nombre" cssClass="error" /><br> <form:input
						path="str_nombre" /></td>
			</tr>
			<tr>
				<td>Ap.Paterno</td>
				<td><form:errors path="str_apellido_paterno" cssClass="error" /><br> <form:input
						path="str_apellido_paterno" /></td>
			</tr>
			<tr>
				<td>Ap. Materno:</td>
				<td><form:errors path="str_apellido_materno" cssClass="error" /><br> <form:input
						path="str_apellido_materno" /></td>
			</tr>
						<tr>
				<td>Departamento:</td>
				<td><form:select path="distrito.provincia.departamento.id" 
						id="departamento" style="width:200px;">
						<form:option value="" label="-- Seleccione Departamento --" />
						<form:options items="${listDepartamentos}" itemValue="id"
							itemLabel="nombre" />
					</form:select></td>
				<td>Provincia:</td>
				<td><form:select path="distrito.provincia.id" id="provincia" style="width:200px;">
						<form:option value="" label="-- Seleccione Provincia --" />
						<form:options items="${listProvincias}" itemValue="id"
							itemLabel="nombre" />
					</form:select></td>
				<td>Distrito:</td>
				<td><form:select path="distrito.id" id="distrito" style="width:200px;">
						<form:option value="" label="-- Seleccione Distrito --" />
						<form:options items="${listDistritos}" itemValue="id"
							itemLabel="nombre" />
					</form:select></td>
			</tr>
			
			<tr>
				<td>
					<button type="reset" title="Limpiar">
						<img src="resources/img/Borrar.png" width="50" height="50" border="0">
					</button>
				</td>
				<td>
					<button type="submit" title="Grabar">
						<img src="resources/img/Grabar.png" width="50" height="50" border="0">
					</button>
				</td>
				
			</tr>
		</table>
		
	</form:form>
	
    <a href="listDocentes" cssClass="Navegador"><img src="resources/img/docente.jpg" width="50" height="50" border="0" />Ir a Mantenimiento Docente</a>
</body>
</html>