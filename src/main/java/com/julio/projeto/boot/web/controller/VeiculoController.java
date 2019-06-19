package com.julio.projeto.boot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.julio.projeto.boot.web.model.Veiculo;
import com.julio.projeto.boot.web.service.VeiculoService;

@Controller
@RequestMapping("/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoService service;
	
	@GetMapping("/cadastrar")
	public String retornaPaginaVeiculo(Veiculo veiculo) {
		return "/veiculo/crud_veiculo";
	} 
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("veiculos", service.buscarTodos());
		return "/veiculo/crud_listar"; 
	}
	
	@PostMapping("/salvar")
	public String salvar(Veiculo veiculo) {
		service.salvar(veiculo);
		return "redirect:/veiculos/cadastrar";
	}
}
