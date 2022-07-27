package br.com.msaorim.loja.testes;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;

public class TesteCadastro implements CommandLineRunner {
//	@Autowired
//	private ProdutoRepository produtoRepository;
//
//	@Autowired
//	private CategoriaRepository categoriaRepository;
//
//	@Autowired
//	private ClienteRepository clienteRepository;
//
//	@Autowired
//	private PedidoRepository pedidoRepository;
//
//	@Autowired
//	private ItemPedidoRepository itemPedidoRepository;
	//==========================================================
	
	@Override
	public void run(String... args) throws Exception {
		menu();
		
	}
	
	

	//==========================================================
	public void menu() {
		Scanner sc = new Scanner(System.in);
		boolean continua = true;
		char resp = 's';

		while (continua) {
			System.out.println("\n\nTeste de Cadastros");
			System.out.println("==================\n");
			System.out.println("0. Sair");
			System.out.println("1. Cadastro de Categoria");
			System.out.println("2. Cadastro de Produto");
			System.out.println("3. Listagem de Produtos Cadastrados");
			System.out.println("4. Criar Pedido");
			System.out.println("5. Consultar Pedido");
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
			case '3':
				System.out.println("LISTAR PRODUTOS");
				System.out.println("===============");
				listarProduto();
				break;
			case '4':
				System.out.println("CRIAR PEDIDO");
				System.out.println("============");
				salvarPedido();
				break;
			case '5':
				System.out.println("LISTAR PEDIDOS");
				System.out.println("==============");
				listarPedido();
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
		//
	}

	public void salvarProduto() {
		//
	}
	
	public void listarProduto() {
		//
	}
	
	public void salvarPedido() {
		//
	}
	
	public void listarPedido() {
		//
	}
}
