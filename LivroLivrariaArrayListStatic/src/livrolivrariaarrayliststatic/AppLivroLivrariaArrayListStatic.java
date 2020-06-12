package livrolivrariaarrayliststatic;

import java.util.Scanner;

public class AppLivroLivrariaArrayListStatic {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		
		int menu;
		double vInicial, vFinal;
		//referencia para a classe LivroLivraria
		LivroLivraria objLivro;

		String titulo, autor, genero;
		float preco;
		int isbn;
		
		do {
			exibirMenu();
			menu = entrada.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("====>Cadastrar Livro:");
				System.out.print("Digite o título: ");
				titulo = entradaString.nextLine();
				System.out.print("Digite o autor: ");
				autor = entradaString.nextLine();
				System.out.print("Digite o genêro: ");
				genero = entradaString.nextLine();
				System.out.print("Digite o ISBN: ");
				isbn = entrada.nextInt();
				System.out.print("Digite o preço: ");
				preco = entrada.nextFloat();
				
				//criar objeto da classe
				objLivro = new LivroLivraria( titulo, autor, isbn, genero, preco);
				
				//guardar no ArrayList
				Acervo.adicionar(objLivro);
			break;
			case 2:
				System.out.println("====>Listagem de Livros:");
				System.out.println(Acervo.listar());
				
				if(Acervo.listar().isEmpty()) {
					System.out.println("O acervo está vazio!");
				}
			break;
			case 3:
				System.out.println("====>Exclusão do Livro:");
				System.out.print("Digite o título do livro: ");
				titulo = entradaString.nextLine();
				
				if(!(Acervo.getListalivros().isEmpty())) {// Acervo não vazio
					if(Acervo.remover(titulo)) {
						System.out.println("Livro foi removido com sucesso!");
					}else {
						System.out.println("Título não foi encontrado!");
					}
				}else {
					System.out.println("Não existe livros no acervo!!");
				}
			break;
			case 4:
				System.out.println("====>Pesquisar pelo genêro:");
				System.out.print("Digite o genêro: ");
				genero = entradaString.nextLine();
				System.out.println("Existem "+Acervo.pesquisar(genero) + " livros do genêro " + genero);
			break;
			case 5:
				System.out.println("====>Pesquisar por faixa de preço:");
				System.out.print("Digite a faixa inicial e final: ");
				vInicial = entrada.nextDouble();
				vFinal = entrada.nextDouble();
				
				System.out.println("Existem "+Acervo.pesquisar(vInicial, vFinal) + 
				" livros com preços entre " + String.format("R$ %.2f e R$ %.2f\n",vInicial,vFinal));
			break;
			case 6:
				System.out.println("====>Total em R$ de livros no Acervo:");
				System.out.println("O total é: "+ String.format("R$ %.2f \n", Acervo.calcularTotalAcervo()));
			break;
			case 7:
				System.out.println("Saindo...");
			break;
			default:
				System.err.println("Opção de menu inválida!!!");
			}
			
		}while(menu != 7);
		
		
		
		
	}//fim do método main
	public static void exibirMenu() {
		System.out.println("==================== LIVRO LIVRARIA ====================");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - LISTAR");
		System.out.println("3 - EXCLUIR LIVRO");
		System.out.println("4 - PESQUISAR POR GENÊRO");
		System.out.println("5 - PESQUISAR POR FAIXA DE PREÇO");
		System.out.println("6 - CALCULAR TOTAL DO ACERVO");
		System.out.println("7 - SAIR");
		System.out.print("====> Escolha uma opção: ");
	}
}
