package br.com.msaorim.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.msaorim.loja.entities.Produto;
import br.com.msaorim.loja.repositories.ProdutoRepository;

@Controller
public class ProdController {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping(value = "/prod")
	public String prod(Model model) {
		
		List<Produto> produtos = produtoRepository.findAll();
		
		model.addAttribute("produtos", produtos);
		
		return "prod";
	}
}
