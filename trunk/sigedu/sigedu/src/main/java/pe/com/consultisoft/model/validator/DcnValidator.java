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
	                "required.str_dcn", "El campo Nombre del DCN es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dte_fecha_inicio_vig",
	                "required.dte_fecha_inicio_vig", "El campo fecha inicio de vigencia es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dte_fecha_fin_vig",
	                "required.dte_fecha_fin_vig", "El campo fin de vigencia es obligatorio.");
		  
		  
	}
}
