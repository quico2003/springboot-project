package com.proyectoWebServidor.quico_proyecto_spring_boot.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class incioController{
	
	@RequestMapping(value = "/pagina-inicio", method = RequestMethod.POST)
	public String mostrarPaginaInicio(ModelMap model) {
	    return "pagina-inicio";  // Muestra la vista de inicio
	}
}