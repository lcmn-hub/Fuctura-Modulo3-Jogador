package br.com.fuctura.jogador.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fuctura.jogador.model.JogadorModel;
import br.com.fuctura.jogador.repository.JogadorRepository2;



@Controller
public class JogadorController {
	
	@Autowired
	JogadorRepository2 repository;

	
	@GetMapping("/cadastrar")
	public String cadastrar(Model model) {
		
		
		
		model.addAttribute("titulo", "Cadastrar Jogador");
		
		return "cadastrar";
		
		
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
//		Optional<JogadorModel> jogador = repository.findById(2L);
//
//			if (jogador.isPresent()) {
//			model.addAttribute("jogadores", jogador.get());
//		}

		model.addAttribute("titulo", "Listar Jogador");
		
		return "listar";
		
	}
	
	@GetMapping("/listartodos")
	public String listarTodos(Model model) {
		

		
		List<JogadorModel> jogador = repository.findAll();
		model.addAttribute("jogadores", jogador);
		
		model.addAttribute("titulo", "Listar todos os Jogadores");
		
		return "listartodos";
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
