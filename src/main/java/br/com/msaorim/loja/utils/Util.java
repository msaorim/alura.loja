package br.com.msaorim.loja.utils;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.msaorim.loja.entities.Categoria;
import br.com.msaorim.loja.repositories.CategoriaRepository;

public class Util {
	@Autowired
	private CategoriaRepository categoriaRepository;


	public void salvarCategoria(Categoria categoria) {
		categoriaRepository.save(categoria);
	}
//	var cat1 = new Categoria(null, "Celular");
//	var p1 = new Produto(null, "MacBook Pro-X", "Notebook da Apple", 10000.0, cat1);
//
//	System.out.println("\nSalvando categoria " + cat1.getNome() + " ... CREATE ...");
//	categoriaRepository.save(cat1);
//	produtoRepository.save(p1);
//	System.out.println("\nSalvando produto " + p1.getNome() + " ...");
//	var p2 = new Produto(null, "MacBook Pro-Y", "Notebook da Apple", 10000.0, cat1);
//	produtoRepository.save(p2);
//	System.out.println("\nSalvando produto " + p2.getNome() + " ...");
//
//	p2.setNome("Celular XPTO");
//
//	produtoRepository.save(p2);
//	System.out.println("\nAlterando o nome do produto " + p2.getNome() + " ... UPDATE ...");
//	List<Produto> listaProdutos = produtoRepository.findAll();
//
//	System.out.println("\nListando os produtos ... READ ...");
//	for (Produto produto : listaProdutos) {
//		System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
//	}
//
//	System.out.println("\nDeletando o produto com ID 1: " + p1.getNome() + " ... DELETE ...");
//	produtoRepository.deleteById(1L);
//
//	listaProdutos = produtoRepository.findAll();
//
//	System.out.println("\nListando os produtos ...");
//	for (Produto produto : listaProdutos) {
//		System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
//	}
}
