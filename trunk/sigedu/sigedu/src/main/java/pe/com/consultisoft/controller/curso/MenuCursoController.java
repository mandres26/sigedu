package pe.com.consultisoft.controller.curso;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuCursoController {

	@RequestMapping(value = "/menuColegio")
	public String menuColegio(Locale locale, Model model) {	
		return "cursos/colegios/menu_colegio";
	}
	
	@RequestMapping(value = "/menuAsignatura")
	public String menuAsignatura(Locale locale, Model model) {	
		return "cursos/asignaturas/menu_asignatura";
	}
	
	@RequestMapping(value = "/menuCurricula")
	public String menuCurricula(Locale locale, Model model) {	
		return "cursos/curriculas/menu_curricula";
	}

	
	@RequestMapping(value = "/menuHorario")
	public String menuHorario(Locale locale, Model model) {	
		return "cursos/horarios/menu_horario";
	}


}
