package pe.com.consultisoft.model.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pe.com.consultisoft.model.Docente;

@Component
public class DocenteValidator implements Validator{

	@Override
	public boolean supports(Class miClass) {
		// TODO Auto-generated method stub
		return Docente.class.isAssignableFrom(miClass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_nombre",
	                "required.str_nombre", "El campo Nombre de Docente es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_apellido_paterno",
	                "required.str_apellido_paterno", "El campo Ap.Paterno de Docente es obligatorio.");	         
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "str_apellido_materno",
	                "required.str_apellido_materno", "El campo Ap.Materno de Docente es obligatorio.");
	         
	     
	    
		
	}

}
