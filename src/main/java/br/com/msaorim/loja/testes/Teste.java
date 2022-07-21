package br.com.msaorim.loja.testes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.msaorim.loja.entities.Produto;
import br.com.msaorim.loja.entities.enums.Categoria;
import br.com.msaorim.loja.repositories.ProdutoRepository;

@Configuration
public class Teste implements CommandLineRunner {

	@Autowired
	private ProdutoRepository produtoRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		
		var p1 = new Produto(null, "MacBook Pro-X", "Notebook da Apple", 10000.0, Categoria.CELULAR);
		produtoRepository.save(p1);
		
	}

}
