package br.com.msaorim.loja.testes;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.msaorim.loja.entities.Categoria;
import br.com.msaorim.loja.entities.Produto;
import br.com.msaorim.loja.repositories.CategoriaRepository;
import br.com.msaorim.loja.repositories.ProdutoRepository;

@Configuration
public class Teste implements CommandLineRunner {

	@Autowired
	private ProdutoRepository produtoRepository; 
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		var cat1 = new Categoria(null, "Celular");
		var p1 = new Produto(null, "MacBook Pro-X", "Notebook da Apple", 10000.0, cat1);

		categoriaRepository.save(cat1);
		produtoRepository.save(p1);

		
		//p1.setCategoria(cat1);
		//cat1.setProdutos(Arrays.asList(p1));
		
	}

}
