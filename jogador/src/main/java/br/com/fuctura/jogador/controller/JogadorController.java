package br.com.fuctura.jogador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class JogadorController {
	
	@GetMapping("/cadastrar")
	public String cadastrar(Model model) {
		
		
		
		model.addAttribute("titulo", "Cadastrar Jogador");
		
		return "cadastrar";
		
		
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		
		
		model.addAttribute("titulo", "Listar Jogador");
		
		return "listar";
		
	}
	
	@GetMapping("/atualizar")
	public String atualizar(Model model) {
		
		
		
		model.addAttribute("titulo", "Atualizar Jogador");
		
		return "atualizar";
		
	}
	
	@GetMapping("/excluir")
	public String excluir(Model model) {
		
		
		
		
		model.addAttribute("titulo", "Excluir Jogador");
		
		return "excluir";
		
	}
	

}
