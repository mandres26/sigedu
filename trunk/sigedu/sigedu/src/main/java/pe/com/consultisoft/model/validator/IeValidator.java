package pe.com.consultisoft.model.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pe.com.consultisoft.model.Ie;

@Component
public class IeValidator implements Validator{

	@Override
	public boolean supports(Class miClass) {
		// TODO Auto-generated method stub
		return Ie.class.isAssignableFrom(miClass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_codigo_modular",
	                "required.str_codigo_modular", "El campo Codigo Modular es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_codigo_local",
	                "required.str_codigo_local", "El campo Codigo Local es obligatorio.");	         
	}
}
