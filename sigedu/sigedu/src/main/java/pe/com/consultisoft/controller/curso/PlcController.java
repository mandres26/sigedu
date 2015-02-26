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

import pe.com.consultisoft.model.Anho;
import pe.com.consultisoft.model.Plc;
import pe.com.consultisoft.model.validator.PlcValidator;
import pe.com.consultisoft.service.commons.EstadoService;
import pe.com.consultisoft.service.commons.AnhoService;
import pe.com.consultisoft.service.commons.UbigeoService;
import pe.com.consultisoft.service.curso.PlcService;
import pe.com.consultisoft.utilitarios.Constantes;


@Controller
public class PlcController {
	private static final Logger logger = LoggerFactory.getLogger(PlcController.class);
	
	@Autowired
	PlcService plcService;
	
	@Autowired
	PlcValidator plcValidator;
	
	@Autowired
	UbigeoService ubigeoService;
	
	@Autowired
	EstadoService estadoService;
	
	@Autowired
	AnhoService anhoService;

	
	@RequestMapping(value = "/formPlc")
	public ModelAndView form(Locale locale,
								ModelMap model) {
		model.addAttribute("listAnhos", anhoService.listAnhos());
		model.addAttribute("listEstados", estadoService.listEstados());
		ModelAndView mav = new ModelAndView("cursos/plcs/add_plc", "plc", new Plc());
		return mav;
	}
	
	@RequestMapping(value = "/addPlc")
    public String add(@ModelAttribute("plc") Plc plc, 
    					ModelMap model,
    					BindingResult result) {
 
		plcValidator.validate(plc, result);
		if(!result.hasErrors()){
			if(plcService.add(plc)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_OK);
				plc = new Plc();
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_NUEVO_ERROR);				
			}
			
		}
 
        return "cursos/plcs/add_plc";
    }

	@RequestMapping(value = "/deletePlc")
    public String delete(@ModelAttribute("plc") Plc plc,
    						@ModelAttribute("codigo")String int_idplc,
    						ModelMap model) {
 
		plcService.delete(Integer.parseInt(int_idplc));
		if(plcService.delete(Integer.parseInt(int_idplc))==0){
			model.addAttribute("resultado", "0");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_OK);
		}
		else{
			model.addAttribute("resultado", "-1");
			model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ELIMINADO_ERROR);				
		}
		model.addAttribute("listPlcs", plcService.list());
        return "cursos/plcs/list_plc";
    }
	
	@RequestMapping(value = "/viewPlc", method = RequestMethod.GET)
    public String view(@ModelAttribute("codigo") String int_idplc, ModelMap model) {
 
		Plc plc = plcService.find(Integer.parseInt(int_idplc));
		model.addAttribute("plc", plc);
 
        return "cursos/plcs/view_plc";
    }
	
	@RequestMapping(value = "/editPlc")
    public String edit(@ModelAttribute("codigo")
    String int_idplc, ModelMap model) {
 
		Plc plc = plcService.find(Integer.parseInt(int_idplc));
		model.addAttribute("plc", plc);
 
        return "cursos/plcs/edit_plc";
    }

	@RequestMapping(value = "/updatePlc")
    public String update(@ModelAttribute("plc") Plc plc,
    					ModelMap model,
    					BindingResult result) {
 
		plcValidator.validate(plc, result);
		if(!result.hasErrors()){
			if(plcService.update(plc)==0){
				model.addAttribute("resultado", "0");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_OK);
			}
			else{
				model.addAttribute("resultado", "-1");
				model.addAttribute("mensaje", Constantes.Mensajes.MSG_REGISTRO_ACTUALIZADO_ERROR);				
			}
			
		}
 
        return "cursos/plcs/list_plc";
    }

	@RequestMapping(value = "/listPlc")
	public String list(@ModelAttribute("plc") Plc plc,
						Map<String, Object> map){
		logger.info("Ingreso a listar plcs.");
		
		map.put("listPlcs", plcService.list());
		
		return "cursos/plcs/list_plc";
	}

	@RequestMapping(value = "/findPlc")
    public String find(@ModelAttribute("plc") Plc plc,
    					ModelMap model) {
 
		List<Plc> listPlcs;
		listPlcs = plcService.find(plc);
		
		model.addAttribute("listPlcs", listPlcs);
        return "cursos/plcs/list_plc";
    }
}
