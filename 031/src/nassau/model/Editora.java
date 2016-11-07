package nassau.model;

import java.util.List;

public class Editora {
	private String nome;
	private String cnpj;
	private List<Livro> livros;

	public Editora() {	}

	public Editora(String nome, String cnpj, List<Livro> livros) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
