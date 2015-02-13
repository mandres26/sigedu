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

import pe.com.consultisoft.model.Colegio;
import pe.com.consultisoft.model.validator.ColegioValidator;
import pe.com.consultisoft.service.curso.ColegioService;
import pe.com.consultisoft.utilitarios.Constantes;


@Controller
public class ColegioController {
	private static final Logger logger = LoggerFactory.getLogger(ColegioController.class);
	
	@Autowired
	ColegioService colegioService;
	
	@Autowired
	ColegioValidator colegioValidator;

	@RequestMapping(value = "/formColegio")
	public ModelAndView form(Locale locale) {
		logger.info("Ingreso al formulario colegio.", locale);
		ModelAndView mav = new ModelAndView("cursos/colegios/add_colegio", "colegio", new Colegio());
		return mav;
	}
	
	@RequestMapping(value = "/addColegio")
    public String add(@ModelAttribute("colegio") Colegio colegio, 
    					ModelMap model,
    					BindingResult result) {
 
		colegioValidator.validate(colegio, result);
		if(!result.hasErrors()){
			if(colegioService.add(colegio)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_OK);
				colegio = new Colegio();
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_ERROR);				
			}
			
		}
 
        return "cursos/colegios/add_colegio";
    }

	@RequestMapping(value = "/deleteColegio")
    public String delete(@ModelAttribute("colegio") Colegio colegio,
    						@ModelAttribute("int_idcolegio")String int_idcolegio,
    						ModelMap model) {
 
		colegioService.delete(Integer.parseInt(int_idcolegio));
		if(colegioService.delete(Integer.parseInt(int_idcolegio))==0){
			model.addAttribute("resultado", "0");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_OK);
		}
		else{
			model.addAttribute("resultado", "-1");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_ERROR);				
		}
		model.addAttribute("listColegios", colegioService.list());
        return "cursos/colegios/list_colegio";
    }
	
	@RequestMapping(value = "/viewColegio", method = RequestMethod.GET)
    public String view(@ModelAttribute("int_idcolegio")
    String int_idcolegio, ModelMap model) {
 
		Colegio colegio = colegioService.find(Integer.parseInt(int_idcolegio));
		model.addAttribute("colegio", colegio);
 
        return "cursos/colegios/view_colegio";
    }
	
	@RequestMapping(value = "/editColegio")
    public String edit(@ModelAttribute("int_idcolegio")
    String int_idcolegio, ModelMap model) {
 
		Colegio colegio = colegioService.find(Integer.parseInt(int_idcolegio));
		model.addAttribute("colegio", colegio);
 
        return "cursos/colegios/edit_colegio";
    }

	@RequestMapping(value = "/updateColegio")
    public String update(@ModelAttribute("colegio") Colegio colegio,
    					ModelMap model,
    					BindingResult result) {
 
		colegioValidator.validate(colegio, result);
		if(!result.hasErrors()){
			if(colegioService.update(colegio)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_OK);
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_ERROR);				
			}
			
		}
 
        return "cursos/colegios/list_colegio";
    }

	
	@RequestMapping(value = "/listColegio")
	public String list(@ModelAttribute("colegio") Colegio colegio,
						Map<String, Object> map){
		logger.info("Ingreso a listar colegios.");
		
		map.put("listColegios", colegioService.list());
		
		return "cursos/colegios/list_colegio";
	}

	@RequestMapping(value = "/findColegio")
    public String find(@ModelAttribute("colegio") Colegio colegio,
    					ModelMap model) {
 
		List<Colegio> listColegios;
		listColegios = colegioService.find(colegio);
		
		model.addAttribute("listColegios", listColegios);
        return "cursos/colegios/list_colegio";
    }
	
}
