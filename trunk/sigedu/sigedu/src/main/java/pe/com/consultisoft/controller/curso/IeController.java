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
import pe.com.consultisoft.model.Ie;
import pe.com.consultisoft.model.validator.IeValidator;
import pe.com.consultisoft.service.commons.DreService;
import pe.com.consultisoft.service.commons.EstadoService;
import pe.com.consultisoft.service.commons.FormaService;
import pe.com.consultisoft.service.commons.ModalidadService;
import pe.com.consultisoft.service.commons.NivelService;
import pe.com.consultisoft.service.commons.UbigeoService;
import pe.com.consultisoft.service.commons.GestionService;
import pe.com.consultisoft.service.commons.GeneroService;
import pe.com.consultisoft.service.commons.UgelService;
import pe.com.consultisoft.service.curso.IeService;
import pe.com.consultisoft.utilitarios.Constantes;



@Controller
public class IeController {
	private static final Logger logger = LoggerFactory.getLogger(IeController.class);
	
	@Autowired
	IeService ieService;
	
	@Autowired
	IeValidator ieValidator;
	
	@Autowired
	UbigeoService ubigeoService;
	
	@Autowired
	GestionService gestionService;

	@Autowired
	GeneroService generoService;
	
	@Autowired
	NivelService nivelService;
	
	@Autowired
	UgelService ugelService;
	
	@Autowired
	ModalidadService modalidadService;
	
	@Autowired
	FormaService formaService;
	
	@Autowired
	DreService dreService;
	
	@Autowired
	EstadoService estadoService;
	
	
	@RequestMapping(value = "/formIe")
	public ModelAndView form(Locale locale,
								ModelMap model) {
		model.addAttribute("listGestiones", gestionService.listGestiones());
		model.addAttribute("listGeneros", generoService.listGeneros());
		model.addAttribute("listNiveles", nivelService.listNiveles());
		model.addAttribute("listUgeles", ugelService.listUgeles());
		model.addAttribute("listModalidades", modalidadService.listModalidades());
		model.addAttribute("listFormas", formaService.listFormas());
		model.addAttribute("listDres", dreService.listDres());
		model.addAttribute("listEstados", estadoService.listEstados());
		ModelAndView mav = new ModelAndView("cursos/instituciones/add_ie", "ie", new Ie());
		return mav;
	}
	
	@RequestMapping(value = "/addIe")
    public String add(@ModelAttribute("ie") Ie ie, 
    					ModelMap model,
    					BindingResult result) {
 
		ieValidator.validate(ie, result);
		if(!result.hasErrors()){
			if(ieService.add(ie)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_OK);
				ie = new Ie();
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_ERROR);				
			}
			
		}
 
        return "cursos/instituciones/add_ie";
    }

	@RequestMapping(value = "/deleteIe")
    public String delete(@ModelAttribute("ie") Ie ie,
    						@ModelAttribute("codigo")String codigo,
    						ModelMap model) {
 
		ieService.delete(Integer.parseInt(codigo));
		if(ieService.delete(Integer.parseInt(codigo))==0){
			model.addAttribute("resultado", "0");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_OK);
		}
		else{
			model.addAttribute("resultado", "-1");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_ERROR);				
		}
		model.addAttribute("listIes", ieService.list());
        return "cursos/instituciones/list_ie";
    }
	
	@RequestMapping(value = "/viewIe", method = RequestMethod.GET)
    public String view(@ModelAttribute("codigo")
    String codigo, ModelMap model) {
 
		Ie ie = ieService.find(Integer.parseInt(codigo));
		model.addAttribute("ie", ie);
 
        return "cursos/instituciones/view_ie";
    }
	
	@RequestMapping(value = "/editIe")
    public String edit(@ModelAttribute("codigo")
    String codigo, ModelMap model) {
 
		Ie ie = ieService.find(Integer.parseInt(codigo));
		model.addAttribute("ie", ie);
 
        return "cursos/instituciones/edit_ie";
    }

	@RequestMapping(value = "/updateIe")
    public String update(@ModelAttribute("ie") Ie ie,
    					ModelMap model,
    					BindingResult result) {
 
		ieValidator.validate(ie, result);
		if(!result.hasErrors()){
			if(ieService.update(ie)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_OK);
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_ERROR);				
			}
			
		}
 
        return "cursos/instituciones/list_ie";
    }

	
	@RequestMapping(value = "/listIe")
	public String list(@ModelAttribute("ie") Ie ie,
						Map<String, Object> map){
		logger.info("Ingreso a listar instituciones educativas.");
		
		map.put("listIes", ieService.list());
		
		return "cursos/instituciones/list_ie";
	}

	@RequestMapping(value = "/findIe")
    public String find(@ModelAttribute("ie") Ie ie,
    					ModelMap model) {
 
		List<Ie> listIes;
		listIes = ieService.find(ie);
		
		model.addAttribute("listIes", listIes);
        return "cursos/instituciones/list_ie";
    }
}
	
