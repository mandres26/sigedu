package pe.com.consultisoft.model.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pe.com.consultisoft.model.Alumno;

@Component
public class AlumnoValidator implements Validator{

	@Override
	public boolean supports(Class miClass) {
		// TODO Auto-generated method stub
		return Alumno.class.isAssignableFrom(miClass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombres",
	                "required.nombres", "El campo Nombre de Alumno es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "paterno",
	                "required.paterno", "El campo Ap.Paterno de Alumno es obligatorio.");	         
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "materno",
	                "required.materno", "El campo Ap.Materno de Alumno es obligatorio.");
	         
	     
	    
		
	}

}
