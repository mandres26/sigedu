package pe.com.consultisoft.model.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pe.com.consultisoft.model.Curricula;

@Component
public class CurriculaValidator implements Validator{

	@Override
	public boolean supports(Class miClass) {
		// TODO Auto-generated method stub
		return Curricula.class.isAssignableFrom(miClass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre",
	                "required.nombre", "El campo Nombre de la Currícula es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "curso",
	                "required.curso", "El campo Curso es obligatorio.");	         
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "grado",
	                "required.grado", "El campo Grado es obligatorio.");
		  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "colegio",
	                "required.colegio", "El campo Colegio es obligatorio.");   
	}

}
