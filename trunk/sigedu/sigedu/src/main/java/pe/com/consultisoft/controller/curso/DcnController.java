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

//import pe.com.consultisoft.model.Parametro;
import pe.com.consultisoft.model.Dcn;
import pe.com.consultisoft.model.validator.DcnValidator;
import pe.com.consultisoft.service.commons.ModalidadService;
import pe.com.consultisoft.service.commons.TipocentroService;
import pe.com.consultisoft.service.commons.UbigeoService;
import pe.com.consultisoft.service.commons.EstadoService;
import pe.com.consultisoft.service.curso.DcnService;
import pe.com.consultisoft.utilitarios.Constantes;


@Controller
public class DcnController {
	private static final Logger logger = LoggerFactory.getLogger(DcnController.class);
	
	@Autowired
	DcnService dcnService;
	
	@Autowired
	DcnValidator dcnValidator;
	
	@Autowired
	UbigeoService ubigeoService;
	
	@Autowired
	ModalidadService modalidadService;

	@Autowired
	TipocentroService tipocentroService;
	
	@Autowired
	EstadoService estadoService;
	
	@RequestMapping(value = "/formDcn")
	public ModelAndView form(Locale locale,
								ModelMap model) {
		logger.info("Ingreso al formulario dcn.", locale);
		model.addAttribute("listModalidades", modalidadService.listModalidades());
		model.addAttribute("listTipocentros", tipocentroService.listTipocentros());
		model.addAttribute("listEstados", estadoService.listEstados());
		ModelAndView mav = new ModelAndView("cursos/dcns/add_dcn", "dcn", new Dcn());
		
		return mav;
	}
	
	@RequestMapping(value = "/addDcn")
    public String add(@ModelAttribute("dcn") Dcn dcn, 
    					ModelMap model,
    					BindingResult result) {
 
		dcnValidator.validate(dcn, result);
		if(!result.hasErrors()){
			if(dcnService.add(dcn)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_OK);
				dcn = new Dcn();
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_ERROR);				
			}
			
		}
 
        return "cursos/dcns/add_dcn";
    }

	@RequestMapping(value = "/deleteDcn")
    public String delete(@ModelAttribute("dcn") Dcn dcn,
    						@ModelAttribute("codigo")String codigo,
    						ModelMap model) {
 
		dcnService.delete(Integer.parseInt(codigo));
		if(dcnService.delete(Integer.parseInt(codigo))==0){
			model.addAttribute("resultado", "0");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_OK);
		}
		else{
			model.addAttribute("resultado", "-1");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_ERROR);				
		}
		model.addAttribute("listDcns", dcnService.list());
        return "cursos/dcns/list_dcn";
    }
	
	@RequestMapping(value = "/viewDcn", method = RequestMethod.GET)
    public String view(@ModelAttribute("codigo")
    String codigo, ModelMap model) {
 
		Dcn dcn = dcnService.find(Integer.parseInt(codigo));
		model.addAttribute("dcn", dcn);
 
        return "cursos/dcns/view_dcn";
    }
	
	@RequestMapping(value = "/editDcn")
    public String edit(@ModelAttribute("codigo")
    String codigo, ModelMap model) {
 
		Dcn dcn = dcnService.find(Integer.parseInt(codigo));
		model.addAttribute("dcn", dcn);
 
        return "cursos/dcns/edit_dcn";
    }

	@RequestMapping(value = "/updateDcn")
    public String update(@ModelAttribute("dcn") Dcn dcn,
    					ModelMap model,
    					BindingResult result) {
 
		dcnValidator.validate(dcn, result);
		if(!result.hasErrors()){
			if(dcnService.update(dcn)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_OK);
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_ERROR);				
			}
			
		}
 
        return "cursos/dcns/list_dcn";
    }

	
	@RequestMapping(value = "/listDcn")
	public String list(@ModelAttribute("dcn") Dcn dcn,
						Map<String, Object> map, ModelMap model){
		logger.info("Ingreso a listar dcns.");
		model.addAttribute("listModalidades", modalidadService.listModalidades());
		map.put("listDcns", dcnService.list());
		
		return "cursos/dcns/list_dcn";
	}

	@RequestMapping(value = "/findDcn")
    public String find(@ModelAttribute("dcn") Dcn dcn,
    					ModelMap model) {
 
		List<Dcn> listDcns;
		listDcns = dcnService.find(dcn);
		
		model.addAttribute("listDcns", listDcns);
        return "cursos/dcns/list_dcn";
    }
}
	
