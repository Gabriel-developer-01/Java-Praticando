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
				System.out.print("Digite o t�tulo: ");
				titulo = entradaString.nextLine();
				System.out.print("Digite o autor: ");
				autor = entradaString.nextLine();
				System.out.print("Digite o gen�ro: ");
				genero = entradaString.nextLine();
				System.out.print("Digite o ISBN: ");
				isbn = entrada.nextInt();
				System.out.print("Digite o pre�o: ");
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
					System.out.println("O acervo est� vazio!");
				}
			break;
			case 3:
				System.out.println("====>Exclus�o do Livro:");
				System.out.print("Digite o t�tulo do livro: ");
				titulo = entradaString.nextLine();
				
				if(!(Acervo.getListalivros().isEmpty())) {// Acervo n�o vazio
					if(Acervo.remover(titulo)) {
						System.out.println("Livro foi removido com sucesso!");
					}else {
						System.out.println("T�tulo n�o foi encontrado!");
					}
				}else {
					System.out.println("N�o existe livros no acervo!!");
				}
			break;
			case 4:
				System.out.println("====>Pesquisar pelo gen�ro:");
				System.out.print("Digite o gen�ro: ");
				genero = entradaString.nextLine();
				System.out.println("Existem "+Acervo.pesquisar(genero) + " livros do gen�ro " + genero);
			break;
			case 5:
				System.out.println("====>Pesquisar por faixa de pre�o:");
				System.out.print("Digite a faixa inicial e final: ");
				vInicial = entrada.nextDouble();
				vFinal = entrada.nextDouble();
				
				System.out.println("Existem "+Acervo.pesquisar(vInicial, vFinal) + 
				" livros com pre�os entre " + String.format("R$ %.2f e R$ %.2f\n",vInicial,vFinal));
			break;
			case 6:
				System.out.println("====>Total em R$ de livros no Acervo:");
				System.out.println("O total �: "+ String.format("R$ %.2f \n", Acervo.calcularTotalAcervo()));
			break;
			case 7:
				System.out.println("Saindo...");
			break;
			default:
				System.err.println("Op��o de menu inv�lida!!!");
			}
			
		}while(menu != 7);
		
		
		
		
	}//fim do m�todo main
	public static void exibirMenu() {
		System.out.println("==================== LIVRO LIVRARIA ====================");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - LISTAR");
		System.out.println("3 - EXCLUIR LIVRO");
		System.out.println("4 - PESQUISAR POR GEN�RO");
		System.out.println("5 - PESQUISAR POR FAIXA DE PRE�O");
		System.out.println("6 - CALCULAR TOTAL DO ACERVO");
		System.out.println("7 - SAIR");
		System.out.print("====> Escolha uma op��o: ");
	}
}
