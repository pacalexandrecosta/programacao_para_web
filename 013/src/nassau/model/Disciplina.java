package nassau.model;

public class Disciplina {

	private int id;
	private String titulo;
	private int idSemestre;

	public Disciplina(int id, String titulo, int idSemestre) {
		this.id = id;
		this.titulo = titulo;
		this.idSemestre = idSemestre;
	}

	public int getIdSemestre() {
		return idSemestre;
	}

	public void setIdSemestre(int idSemestre) {
		this.idSemestre = idSemestre;
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
