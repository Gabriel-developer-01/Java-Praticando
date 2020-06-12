package livrolivrariaarrayliststatic;

public class LivroLivraria {

	//Atributos
	private String titulo;
	private String autor;
	private int isbn;
	private String genero;
	private float preco;
	
	//Construtores
	public LivroLivraria() {} //default

	public LivroLivraria(String titulo, String autor, int isbn, String genero, float preco) { //personalizado
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.genero = genero;
		this.preco = preco;
	}
	
	//Métodos
	
	public String imprimir() {
		return "Título: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn +
			   "\nGenêro: " + genero + String.format("\nPreço R$ %.2f",preco);
	}
	
	//Métodos de acesso - getters - setters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
