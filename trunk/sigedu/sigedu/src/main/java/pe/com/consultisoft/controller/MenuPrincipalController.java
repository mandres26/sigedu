package pe.com.consultisoft.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuPrincipalController {

	@RequestMapping(value = "/moduloPrincipal")
	public String moduloPrincipal(Locale locale, Model model) {	
		return "menu_principal";
	}

	
	@RequestMapping(value = "/moduloCursos")
	public String moduloCursos(Locale locale, Model model) {	
		return "cursos/menu_cursos";
	}

	@RequestMapping(value = "/moduloMatriculas")
	public String moduloMatriculas(Locale locale, Model model) {	
		return "matriculas/menu_matriculas";
	}

	@RequestMapping(value = "/moduloPagos")
	public String moduloPagos(Locale locale, Model model) {	
		return "pagos/menu_pagos";
	}

	@RequestMapping(value = "/moduloAdministrativo")
	public String moduloAdministrativo(Locale locale, Model model) {	
		return "administrativo/menu_administrativo";
	}
	
	@RequestMapping(value = "/moduloNotas")
	public String moduloNotas(Locale locale, Model model) {	
		return "notas/menu_notas";
	}

	@RequestMapping(value = "/moduloReportes")
	public String moduloReportes(Locale locale, Model model) {	
		return "reportes/menu_reportes";
	}

	@RequestMapping(value = "/moduloPortalPadres")
	public String moduloPortalPadres(Locale locale, Model model) {	
		return "portal_padres/menu_portal_padres";
	}


}
