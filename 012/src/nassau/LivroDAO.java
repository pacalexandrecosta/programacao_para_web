package nassau;

import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

	public List<Livro> getLivros() {
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(new Livro(0, "Indique um livro"));
		livros.add(new Livro(1, "Servlets e JSP: Use a cabeça"));
		livros.add(new Livro(2, "Core Servlets Vol 1"));
		livros.add(new Livro(3, "Core Servlets Vol 2"));
		livros.add(new Livro(4, "HTML 5 Embarque Imediato"));

		return livros;
	}

	public Livro getLivro(int id) {
		Livro l = null;
		List<Livro> livros = getLivros();
		for (Livro livro : livros) {
			if (livro.getId() == id) {
				l = livro;
				break;
			}
		}
		return l;
	}

}
