package br.com.msaorim.loja.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

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

	Scanner sc = new Scanner(System.in);
	boolean continua = true;
	char resp = 's';

	@Override
	public void run(String... args) throws Exception {

		while (continua) {
			System.out.println("\n\nTeste de Cadastros");
			System.out.println("==================\n");
			System.out.println("0. Sair");
			System.out.println("1. Cadastro de Categoria");
			System.out.println("2. Cadastro de Produto");
			System.out.println("3. Listagem de Produtos Cadastrados");
			System.out.println("4. Criar Pedido");
			System.out.println("5. Adicionar Itens ao Pedido");
			System.out.println("6. Consultar Pedido");
			System.out.print("\nEscolha a opção: --->");
			resp = sc.next().charAt(0);

			System.out.println(".\n.\n");

			switch (resp) {
			case '0':
				System.out.println("Saindo ...");
				continua = false;
				break;
			case '1':
				System.out.println("CADASTRAR CATEGORIA");
				System.out.println("===================");
				salvarCategoria();
				break;
			case '2':
				System.out.println("CADASTRAR PRODUTO");
				System.out.println("=================");
				salvarProduto();
				break;
			default: {
				System.out.println("Opção inválida!!!");
				break;
			}
			}
		}

		sc.close();
	}

	public void salvarCategoria() {
		System.out.print("\nNome da Categoria: ");
		String nome = sc.next();
		var cat1 = new Categoria(null, nome);
		System.out.println("\nSalvando categoria: " + cat1.getNome() + "... salvo com sucesso!");
		categoriaRepository.save(cat1);
	}
	
	public void salvarProduto() {
		System.out.print("\nNome do Produto: ");
		String nome = sc.next();
		
		System.out.print("\nDescrição do Produto: ");
		String descricao = sc.next();
		
		System.out.print("\nPreço do Produto: ");
		Double preco = sc.nextDouble();
		
		System.out.println("\nCategoria do Produto: ");
		List<Categoria> lista = new ArrayList<>();
		lista = categoriaRepository.findAll();
		for (Categoria c : lista) {
			System.out.println(c.getId() + ": " + c.getNome());
		}
		boolean ficar = true;
		
		while (ficar) {
			System.out.print("\nEscolha uma Categoria: ");
			long catEscolhida = sc.nextLong();
			System.out.println("");
			Optional<Categoria> obj = categoriaRepository.findById(catEscolhida);
			if(obj.isPresent()) {
				var p = new Produto(null, nome, descricao, preco, obj.get());
				System.out.println(p.getId() + "\n" +
						p.getNome() + "\n" +
						p.getDescricao() + "\n" +
						p.getPreco() + "\n" +
						p.getCategoria().getNome());
				produtoRepository.save(p);
				ficar = false;
			}else {
				System.out.println("Categoria Inválida !!!!!");
			}
		}
	}

}
