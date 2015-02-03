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
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_colegio",
	                "required.str_colegio", "El campo Nombre del Colegio es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_telefono1",
	                "required.str_telefono1", "El campo teléfono 1 es obligatorio.");	         
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_telefono2",
	                "required.str_telefono2", "El campo teléfono 2 es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_celular",
	                "required.str_celular", "El campo celular es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_direccion",
	                "required.str_direccion", "El campo dirección es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_direccion",
	                "required.str_direccion", "El campo dirección es obligatorio.");
	}
}
