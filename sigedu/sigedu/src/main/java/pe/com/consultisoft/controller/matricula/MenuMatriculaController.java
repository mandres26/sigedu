package pe.com.consultisoft.controller.matricula;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuMatriculaController {

	@RequestMapping(value = "/menuMatricula")
	public String menuMatricula(Locale locale, Model model) {	
		return "matriculas/matriculas/menu_matricula";
	}
	
	@RequestMapping(value = "/menuAlumno")
	public String menuAlumno(Locale locale, Model model) {	
		return "matriculas/alumnos/menu_alumno";
	}

	
	@RequestMapping(value = "/menuAula")
	public String menuAula(Locale locale, Model model) {	
		return "matriculas/aulas/menu_aula";
	}


}
