package nassau.DAO;

import java.util.ArrayList;
import java.util.List;

import nassau.model.Editora;
import nassau.model.Livro;

public class EditoraDAO {
	public EditoraDAO() {
	}

	public List<Editora> getEditoras() {
		List<Editora> editoras = new ArrayList<Editora>();

		List<Livro> livros = new LivroDAO().getLivros();

		Editora editora1 = new Editora("Abril", "0001", livros.subList(0, 2));
		Editora editora2 = new Editora("Globo", "0002", livros.subList(2, 4));

		editoras.add(editora1);
		editoras.add(editora2);
		return editoras;
	}
}
