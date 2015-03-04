package pe.com.consultisoft.controller.administrativo;

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

import pe.com.consultisoft.model.Docente;
import pe.com.consultisoft.model.validator.DocenteValidator;
import pe.com.consultisoft.service.administrativo.DocenteService;
import pe.com.consultisoft.utilitarios.Constantes;


@Controller
public class DocenteController {
	private static final Logger logger = LoggerFactory.getLogger(DocenteController.class);
	
	@Autowired
	DocenteService docenteService;
	
	@Autowired
	DocenteValidator docenteValidator;

	@RequestMapping(value = "/formDocente")
	public ModelAndView form(Locale locale) {
		logger.info("Ingreso al formulario docente.", locale);
		ModelAndView mav = new ModelAndView("administrativo/docentes/add_docente", "docente", new Docente());
		return mav;
	}
	
	@RequestMapping(value = "/addDocente")
    public String add(@ModelAttribute("docente") Docente docente, 
    					ModelMap model,
    					BindingResult result) {
 
		docenteValidator.validate(docente, result);
		if(!result.hasErrors()){
			if(docenteService.add(docente)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_OK);
				docente = new Docente();
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_ERROR);				
			}
			
		}
 
        return "administrativo/docentes/add_docente";
    }

	@RequestMapping(value = "/deleteDocente")
    public String delete(@ModelAttribute("docente") Docente docente,
    						@ModelAttribute("codigo")Integer int_iddocente,
    						ModelMap model) {
 
		docenteService.delete(int_iddocente);
		if(docenteService.delete(int_iddocente)==0){
			model.addAttribute("resultado", "0");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_OK);
		}
		else{
			model.addAttribute("resultado", "-1");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_ERROR);				
		}
		model.addAttribute("listDocentes", docenteService.list());
        return "administrativo/docentes/list_docente";
    }
	
	@RequestMapping(value = "/viewDocente", method = RequestMethod.GET)
    public String view(@ModelAttribute("codigo")
    String int_iddocente, ModelMap model) {
 
		Docente docente = docenteService.find(Integer.parseInt(int_iddocente));
		model.addAttribute("docente", docente);
 
        return "administrativo/docentes/view_docente";
    }
	
	@RequestMapping(value = "/editDocente")
    public String edit(@ModelAttribute("codigo")
    String int_iddocente, ModelMap model) {
 
		Docente docente = docenteService.find(Integer.parseInt(int_iddocente));
		model.addAttribute("docente", docente);
 
        return "administrativo/docentes/edit_docente";
    }

	@RequestMapping(value = "/updateDocente")
    public String update(@ModelAttribute("docente") Docente docente,
    					ModelMap model,
    					BindingResult result) {
 
		docenteValidator.validate(docente, result);
		if(!result.hasErrors()){
			if(docenteService.update(docente)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_OK);
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_ERROR);				
			}
			
		}
 
        return "administrativo/docentes/edit_docente";
    }

	
	@RequestMapping(value = "/listDocentes")
	public String list(@ModelAttribute("docente") Docente docente,
						Map<String, Object> map){
		logger.info("Ingreso a listar docentes.");
		
		map.put("listDocentes", docenteService.list());
		
		return "administrativo/docentes/list_docente";
	}

	@RequestMapping(value = "/findDocente")
    public String find(@ModelAttribute("docente") Docente docente,
    					ModelMap model) {
 
		List<Docente> listDocentes;
		listDocentes = docenteService.find(docente);
		
		model.addAttribute("listDocentes", listDocentes);
        return "administrativo/docentes/list_docente";
    }
	
}
