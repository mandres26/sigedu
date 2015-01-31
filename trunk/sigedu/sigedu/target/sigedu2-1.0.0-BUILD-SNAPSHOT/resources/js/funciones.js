function eliminar(nombre, accion){
	if (confirm("¿Esta seguro de eliminar el registro: "+nombre+"?","Eliminar")==true)
        location.replace(accion);
}