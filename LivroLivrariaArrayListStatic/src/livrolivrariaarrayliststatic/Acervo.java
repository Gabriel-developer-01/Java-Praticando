package livrolivrariaarrayliststatic;

import java.util.ArrayList;

public class Acervo {

	private static ArrayList<LivroLivraria> listaLivros = new ArrayList<>();

	// Método GET
	public static ArrayList<LivroLivraria> getListalivros() {
		return listaLivros;
	}

	// Adicionar um objeto na lista

	public static void adicionar(LivroLivraria l) {
		listaLivros.add(l);
	}

	// lista os dados de todos os objetos da lista
	public static String listar() {
		String saida = "";

		int i = 1;
		for (LivroLivraria l : listaLivros) {
			saida += "\n======= Livro N° " + (i++) + "=======\n";
			saida += l.imprimir() + "\n";
		}
		return saida;
	}

	// pesquisar por genero
	public static int pesquisar(String genero) {
		int qtd = 0;

		for (LivroLivraria l : listaLivros) {
			if (l.getGenero().equalsIgnoreCase(genero)) {
				qtd++;
			}
		}
	return qtd;
	}

	//pesquisar por faixa de preço
	public static int pesquisar(double vInicial, double vFinal) {
		int qtd = 0;

		for (LivroLivraria l : listaLivros) {
			if (l.getPreco() >= vInicial && l.getPreco() <= vFinal) {
				qtd++;
			}
		}

		return qtd;
	}

	// remove um livro pelo título
	public static boolean remover(String titulo) {
		for (LivroLivraria l : listaLivros) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				listaLivros.remove(l);
				return true;
			}
		}
		return false;
	}
	// total acervo
	public static double calcularTotalAcervo() {
		double total = 0;
		for (LivroLivraria l : listaLivros) {
			total+= l.getPreco();
		}
		return total;
	}
}