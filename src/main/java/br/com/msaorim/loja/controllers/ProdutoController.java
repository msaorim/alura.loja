package br.com.msaorim.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msaorim.loja.entities.Produto;
import br.com.msaorim.loja.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService serv;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		return ResponseEntity.ok().body(serv.findAll());
	}
}
