package br.com.msaorim.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.msaorim.loja.entities.Pedido;
import br.com.msaorim.loja.services.PedidoService;

@Controller
@RequestMapping(value = "/pedido")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping(value = "/endpoint")
	public ResponseEntity<List<Pedido>> findAll(){
		List<Pedido> lista = pedidoService.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/formulario")
	public String formulario() {
		return "pedido/formulario";
	}
}
