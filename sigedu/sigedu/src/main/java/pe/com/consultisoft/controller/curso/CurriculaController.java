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

import pe.com.consultisoft.model.Curricula;
import pe.com.consultisoft.model.validator.CurriculaValidator;
import pe.com.consultisoft.service.curso.CurriculaService;
import pe.com.consultisoft.utilitarios.Constantes;


@Controller
public class CurriculaController {
	private static final Logger logger = LoggerFactory.getLogger(CurriculaController.class);
	
	@Autowired
	CurriculaService curriculaService;
	
	@Autowired
	CurriculaValidator curriculaValidator;

	@RequestMapping(value = "/formCurricula")
	public ModelAndView form(Locale locale) {
		logger.info("Ingreso al formulario curricula.", locale);
		ModelAndView mav = new ModelAndView("cursos/curriculas/add_curricula", "curricula", new Curricula());
		return mav;
	}
	
	@RequestMapping(value = "/addCurricula")
    public String add(@ModelAttribute("curricula") Curricula curricula, 
    					ModelMap model,
    					BindingResult result) {
 
		curriculaValidator.validate(curricula, result);
		if(!result.hasErrors()){
			if(curriculaService.add(curricula)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_OK);
				curricula = new Curricula();
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_ERROR);				
			}
			
		}
 
        return "cursos/curriculas/add_curricula";
    }

	@RequestMapping(value = "/deleteCurricula")
    public String delete(@ModelAttribute("curricula") Curricula curricula,
    						@ModelAttribute("codigo")String codigo,
    						ModelMap model) {
 
		curriculaService.delete(Integer.parseInt(codigo));
		if(curriculaService.delete(Integer.parseInt(codigo))==0){
			model.addAttribute("resultado", "0");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_OK);
		}
		else{
			model.addAttribute("resultado", "-1");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_ERROR);				
		}
		model.addAttribute("listCurriculas", curriculaService.list());
        return "cursos/curriculas/list_curricula";
    }
	
	@RequestMapping(value = "/viewCurricula", method = RequestMethod.GET)
    public String view(@ModelAttribute("codigo")
    String codigo, ModelMap model) {
 
		Curricula curricula = curriculaService.find(Integer.parseInt(codigo));
		model.addAttribute("curricula", curricula);
 
        return "cursos/curriculas/view_curricula";
    }
	
	@RequestMapping(value = "/editCurricula")
    public String edit(@ModelAttribute("codigo")
    String codigo, ModelMap model) {
 
		Curricula curricula = curriculaService.find(Integer.parseInt(codigo));
		model.addAttribute("curricula", curricula);
 
        return "cursos/curriculas/edit_curricula";
    }

	@RequestMapping(value = "/updateCurricula")
    public String update(@ModelAttribute("curricula") Curricula curricula,
    					ModelMap model,
    					BindingResult result) {
 
		curriculaValidator.validate(curricula, result);
		if(!result.hasErrors()){
			if(curriculaService.update(curricula)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_OK);
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_ERROR);				
			}
			
		}
 
        return "cursos/curriculas/edit_curricula";
    }

	
	@RequestMapping(value = "/listCurricula")
	public String list(@ModelAttribute("curricula") Curricula curricula,
						Map<String, Object> map){
		logger.info("Ingreso a listar curriculas.");
		
		map.put("listCurriculas", curriculaService.list());
		
		return "cursos/curriculas/list_curricula";
	}

	@RequestMapping(value = "/findCurricula")
    public String find(@ModelAttribute("curricula") Curricula curricula,
    					ModelMap model) {
 
		List<Curricula> listCurriculas;
		listCurriculas = curriculaService.find(curricula);
		
		model.addAttribute("listCurriculas", listCurriculas);
        return "cursos/curriculas/list_curricula";
    }
	
}
