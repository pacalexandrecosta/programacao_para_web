package nassau.DAO;

import java.util.ArrayList;
import java.util.List;

import nassau.model.Livro;

public class LivroDAO {
	public LivroDAO() {
	}

	public List<Livro> getLivros() {
		List<Livro> livros = new ArrayList<Livro>();
		long i = 0;
		livros.add(new Livro(++i, "Branca de Neve", "Livro Infantil", "Irmãos Grimm"));
		livros.add(new Livro(++i, "Agosto", "Ficção sobre Governo Janio Quadros", "Rubem Fonseca"));
		return livros;
	}

	public Livro getLivroById(long id) {
		Livro livro = null;
		for (Livro l : getLivros()) {
			if (l.getId() == id) {
				livro = l;
				break;
			}
		}

		return livro;
	}
}
