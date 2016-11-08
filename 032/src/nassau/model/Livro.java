package nassau.model;

public class Livro {
	private long id;
	private String titulo;
	private String descricao;
	private String autor;

	public Livro() {
	}

	public Livro(long id, String titulo, String descricao, String autor) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.autor = autor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
