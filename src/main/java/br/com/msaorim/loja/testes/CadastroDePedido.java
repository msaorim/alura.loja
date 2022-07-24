package br.com.msaorim.loja.testes;

import java.util.Scanner;

import br.com.msaorim.loja.entities.Categoria;

public class CadastroDePedido {
	
	
	public static void main(String[] args) {

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
				System.out.println("Escolha foi '1'");
				var cat1 = new Categoria(null, "Celular");
				System.out.println("\nSalvando categoria " + cat1.getNome() + " ... CREATE ...");
				
				break;
			case '2':
				System.out.println("Escolha foi '2'");
				break;
			default: {
				System.out.println("Opção inválida!!!");
				break;
			}
			}
		}

		// System.out.println("Nome do produto: ");
		// System.out.println("Descrição: ");
		// System.out.println("Preço: R$");
		sc.close();
	}

}
