package pe.com.consultisoft.model.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pe.com.consultisoft.model.Dcn;

@Component
public class DcnValidator implements Validator{

	@Override
	public boolean supports(Class miClass) {
		// TODO Auto-generated method stub
		return Dcn.class.isAssignableFrom(miClass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_dcn",
	                "required.str_colegio", "El campo Nombre del DCN es obligatorio.");
	}
}
