package pe.com.consultisoft.model.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pe.com.consultisoft.model.Plc;

@Component
public class PlcValidator implements Validator{

	@Override
	public boolean supports(Class miClass) {
		// TODO Auto-generated method stub
		return Plc.class.isAssignableFrom(miClass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_plc",
	                "required.str_plc", "El campo PLC es obligatorio.");
	}
}
