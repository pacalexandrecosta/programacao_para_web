package nassau.DAO;

import java.util.ArrayList;
import java.util.List;

import nassau.model.Autor;
import nassau.model.Livro;

public class LivroDAO {
	public LivroDAO() {
	}

	public List<Livro> getLivros() {
		List<Livro> livros = new ArrayList<Livro>();
		Autor autor1 = new Autor("Jose de Alencar");
		Autor autor2 = new Autor("Machado de Assis");
		
		Livro livro1 = new Livro("Iracema", autor1);
		Livro livro2 = new Livro("O guarani", autor1);
		
		Livro livro3 = new Livro("O Alienista", autor2);
		Livro livro4 = new Livro("Dom Casmurro", autor2);
		
		livros.add(livro1);
		livros.add(livro2);
		livros.add(livro3);
		livros.add(livro4);
		
		return livros;

	}
}
