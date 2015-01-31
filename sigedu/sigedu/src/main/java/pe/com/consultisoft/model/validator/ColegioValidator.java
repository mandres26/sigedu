package pe.com.consultisoft.model.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pe.com.consultisoft.model.Colegio;

@Component
public class ColegioValidator implements Validator{

	@Override
	public boolean supports(Class miClass) {
		// TODO Auto-generated method stub
		return Colegio.class.isAssignableFrom(miClass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre",
	                "required.nombre", "El campo Nombre del Colegio es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telefono1",
	                "required.telefono1", "El campo teléfono 1 es obligatorio.");	         
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telefono2",
	                "required.telefono2", "El campo teléfono 2 es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "celular",
	                "required.celular", "El campo celular es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "direccion",
	                "required.direccion", "El campo dirección es obligatorio.");
	}
}
