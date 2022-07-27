package br.com.msaorim.loja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msaorim.loja.entities.Produto;
import br.com.msaorim.loja.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	public List<Produto> findAll(){
		return repo.findAll();
	}
	
}
