package nassau.service;

import java.util.ArrayList;
import java.util.List;

import nassau.model.Aluno;

public class AlunoService {

	public List<Aluno> getAlunos() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		for (int i = 0; i < 5; i++) {
			alunos.add(new Aluno(i, "Nome #" + i, i));
		}
		return alunos;
	}
}
