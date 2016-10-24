package nassau;

public class Livro {
	private int id;
	private String titulo;

	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public Livro(int id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
