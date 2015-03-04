package pe.com.consultisoft.controller.matricula;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pe.com.consultisoft.model.Alumno;
import pe.com.consultisoft.model.validator.AlumnoValidator;
import pe.com.consultisoft.service.commons.UbigeoService;
import pe.com.consultisoft.service.matricula.AlumnoService;
import pe.com.consultisoft.utilitarios.Constantes;


@Controller
public class AlumnoController {
	private static final Logger logger = LoggerFactory.getLogger(AlumnoController.class);
	
	@Autowired
	AlumnoService alumnoService;
	
	@Autowired
	UbigeoService ubigeoService;
	
	@Autowired
	AlumnoValidator alumnoValidator;

	@RequestMapping(value = "/formAlumno")
	public ModelAndView form(Locale locale,
								ModelMap model) {
		model.addAttribute("listDepartamentos", ubigeoService.listDepartamentos());
		
		ModelAndView mav = new ModelAndView("matriculas/alumnos/add_alumno", "alumno", new Alumno());
		return mav;
	}
	
	@RequestMapping(value = "/addAlumno")
    public String add(@ModelAttribute("alumno") Alumno alumno, 
    					ModelMap model,
    					BindingResult result) {
 
		alumnoValidator.validate(alumno, result);
		if(!result.hasErrors()){
			if(alumnoService.add(alumno)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_OK);
				alumno = new Alumno();
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_ERROR);				
			}
		}
 
        return "matriculas/alumnos/add_alumno";
    }

	@RequestMapping(value = "/deleteAlumno")
    public String delete(@ModelAttribute("alumno") Alumno alumno,
    						@ModelAttribute("codigo")String codigo,
    						ModelMap model) {
 
		alumnoService.delete(Integer.parseInt(codigo));
		if(alumnoService.delete(Integer.parseInt(codigo))==0){
			model.addAttribute("resultado", "0");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_OK);
		}
		else{
			model.addAttribute("resultado", "-1");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_ERROR);				
		}
		model.addAttribute("listAlumnos", alumnoService.list());
        return "matriculas/alumnos/list_alumno";
    }
	
	@RequestMapping(value = "/viewAlumno", method = RequestMethod.GET)
    public String view(@ModelAttribute("codigo")
    String codigo, ModelMap model) {
 
		Alumno alumno = alumnoService.find(Integer.parseInt(codigo));
		model.addAttribute("alumno", alumno);
 
        return "matriculas/alumnos/view_alumno";
    }
	
	@RequestMapping(value = "/editAlumno")
    public String edit(@ModelAttribute("codigo")
    String codigo, ModelMap model) {
 
		Alumno alumno = alumnoService.find(Integer.parseInt(codigo));
		model.addAttribute("alumno", alumno);
 
        return "matriculas/alumnos/edit_alumno";
    }

	@RequestMapping(value = "/updateAlumno")
    public String update(@ModelAttribute("alumno") Alumno alumno,
    					ModelMap model,
    					BindingResult result) {
 
		alumnoValidator.validate(alumno, result);
		if(!result.hasErrors()){
			if(alumnoService.update(alumno)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_OK);
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_ERROR);				
			}
			
		}
 
        return "matriculas/alumnos/edit_alumno";
    }

	
	@RequestMapping(value = "/listAlumno")
	public String list(@ModelAttribute("alumno") Alumno alumno,
						Map<String, Object> map){
		logger.info("Ingreso a listar alumnos.");
		
		map.put("listAlumnos", alumnoService.list());
		
		return "matriculas/alumnos/list_alumno";
	}

	@RequestMapping(value = "/findAlumno")
    public String find(@ModelAttribute("alumno") Alumno alumno,
    					ModelMap model) {
 
		List<Alumno> listAlumnos;
		listAlumnos = alumnoService.find(alumno);
		
		model.addAttribute("listAlumnos", listAlumnos);
        return "matriculas/alumnos/list_alumno";
    }
	
	@RequestMapping(value = "/listarProvincias")
	public ModelAndView listarProvincias(@ModelAttribute("alumno") Alumno alumno,
										Locale locale,
										ModelMap model) {
		model.addAttribute("listDepartamentos", ubigeoService.listDepartamentos());
		model.addAttribute("listProvincias", ubigeoService.findProvinciasPorDepartamento(alumno.getDistrito().getProvincia().getDepartamento().getId()));
		//System.out.println(ubigeoService.findProvinciasPorDepartamento(alumno.getDistrito().getProvincia().getDepartamento().getId()).get(0));
		ModelAndView mav = new ModelAndView("matriculas/alumnos/add_alumno", "alumno", new Alumno());
		return mav;
	}

	
}
