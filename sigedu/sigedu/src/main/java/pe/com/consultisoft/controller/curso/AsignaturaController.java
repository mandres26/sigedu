package pe.com.consultisoft.controller.curso;

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

import pe.com.consultisoft.model.Asignatura;
import pe.com.consultisoft.model.validator.AsignaturaValidator;
import pe.com.consultisoft.service.curso.AsignaturaService;
import pe.com.consultisoft.utilitarios.Constantes;


@Controller
public class AsignaturaController {
	private static final Logger logger = LoggerFactory.getLogger(AsignaturaController.class);
	
	@Autowired
	AsignaturaService asignaturaService;
	
	@Autowired
	AsignaturaValidator asignaturaValidator;

	@RequestMapping(value = "/formAsignatura")
	public ModelAndView form(Locale locale) {
		logger.info("Ingreso al formulario asignatura.", locale);
		ModelAndView mav = new ModelAndView("cursos/asignaturas/add_asignatura", "asignatura", new Asignatura());
		return mav;
	}
	
	@RequestMapping(value = "/addAsignatura")
    public String add(@ModelAttribute("asignatura") Asignatura asignatura, 
    					ModelMap model,
    					BindingResult result) {
 
		asignaturaValidator.validate(asignatura, result);
		if(!result.hasErrors()){
			if(asignaturaService.add(asignatura)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_OK);
				asignatura = new Asignatura();
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_ERROR);				
			}
			
		}
 
        return "cursos/asignaturas/add_asignatura";
    }

	@RequestMapping(value = "/deleteAsignatura")
    public String delete(@ModelAttribute("asignatura") Asignatura asignatura,
    						@ModelAttribute("codigo")String codigo,
    						ModelMap model) {
 
		asignaturaService.delete(Integer.parseInt(codigo));
		if(asignaturaService.delete(Integer.parseInt(codigo))==0){
			model.addAttribute("resultado", "0");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_OK);
		}
		else{
			model.addAttribute("resultado", "-1");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_ERROR);				
		}
		model.addAttribute("listAsignaturas", asignaturaService.list());
        return "cursos/asignaturas/list_asignatura";
    }
	
	@RequestMapping(value = "/viewAsignatura", method = RequestMethod.GET)
    public String view(@ModelAttribute("codigo")
    String codigo, ModelMap model) {
 
		Asignatura asignatura = asignaturaService.find(Integer.parseInt(codigo));
		model.addAttribute("asignatura", asignatura);
 
        return "cursos/asignaturas/view_asignatura";
    }
	
	@RequestMapping(value = "/editAsignatura")
    public String edit(@ModelAttribute("codigo")
    String codigo, ModelMap model) {
 
		Asignatura asignatura = asignaturaService.find(Integer.parseInt(codigo));
		model.addAttribute("asignatura", asignatura);
 
        return "cursos/asignaturas/edit_asignatura";
    }

	@RequestMapping(value = "/updateAsignatura")
    public String update(@ModelAttribute("asignatura") Asignatura asignatura,
    					ModelMap model,
    					BindingResult result) {
 
		asignaturaValidator.validate(asignatura, result);
		if(!result.hasErrors()){
			if(asignaturaService.update(asignatura)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_OK);
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_ERROR);				
			}
			
		}
 
        return "cursos/asignaturas/edit_asignatura";
    }

	
	@RequestMapping(value = "/listAsignatura")
	public String list(@ModelAttribute("asignatura") Asignatura asignatura,
						Map<String, Object> map){
		logger.info("Ingreso a listar asignaturas.");
		
		map.put("listAsignaturas", asignaturaService.list());
		
		return "cursos/asignaturas/list_asignatura";
	}

	@RequestMapping(value = "/findAsignatura")
    public String find(@ModelAttribute("asignatura") Asignatura asignatura,
    					ModelMap model) {
 
		List<Asignatura> listAsignaturas;
		listAsignaturas = asignaturaService.find(asignatura);
		
		model.addAttribute("listAsignaturas", listAsignaturas);
        return "cursos/asignaturas/list_asignatura";
    }
}
