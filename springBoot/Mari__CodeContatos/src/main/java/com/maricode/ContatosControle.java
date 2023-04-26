package com.maricode;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {

	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {

		LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 34 22222222"));
		LISTA_CONTATOS.add(new Contato("2", "Lia", "+55 34 22222222"));
		LISTA_CONTATOS.add(new Contato("3", "Laura", "+55 34 22222222"));
		LISTA_CONTATOS.add(new Contato("4", "Valentina", "+55 34 22222222"));
		LISTA_CONTATOS.add(new Contato("5", "Mariana", "+55 34 22222222"));
		
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		
		return modelAndView;
	
	}
}

