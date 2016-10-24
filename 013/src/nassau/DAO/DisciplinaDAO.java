package nassau.DAO;

import java.util.ArrayList;
import java.util.List;

import nassau.model.Disciplina;

public class DisciplinaDAO {
	public List<Disciplina> getDisciplinas() {
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		disciplinas.add(new Disciplina(1, "Lógica de programação Algoritmica", 1));
		disciplinas.add(new Disciplina(2, "Portugues", 1));
		disciplinas.add(new Disciplina(3, "Matematica", 1));
		disciplinas.add(new Disciplina(4, "Sistemas Operacionais", 1));
		disciplinas.add(new Disciplina(5, "Banco de Dados", 1));
		disciplinas.add(new Disciplina(6, "Programação para Web", 2));
		disciplinas.add(new Disciplina(7, "Arquitetura de Sistemas", 2));
		disciplinas.add(new Disciplina(8, "Técnicas de Negociação", 2));
		disciplinas.add(new Disciplina(9, "Alan", 2));
		return disciplinas;
	}

	public List<Disciplina> getDisciplinasPorSemestre(int semestre) {
		List<Disciplina> disciplinas = getDisciplinas();
		List<Disciplina> filtro = new ArrayList<Disciplina>();
		for (Disciplina d : disciplinas) {
			if (d.getIdSemestre() == semestre) {
				filtro.add(d);
			}
		}
		return filtro;

	}

}
