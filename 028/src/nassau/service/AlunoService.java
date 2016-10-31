package nassau.service;

import java.util.ArrayList;
import java.util.List;

import nassau.Aluno;

public class AlunoService {

	public List<Aluno> getAlunoByNome(String pattern) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		for (Aluno a : getAlunos()) {
			if (a.getNome().toLowerCase().contains(pattern.toLowerCase())) {
				alunos.add(a);
			}
		}
		return alunos;

	}

	public List<Aluno> getAlunos() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		int i = 1;
		alunos.add(new Aluno(i++, "ADALBERTO FERREIRA DE OLIVEIRA"));
		alunos.add(new Aluno(i++, "ADALBERTO PAULO DA COSTA OLIVEIRA FILHO"));
		alunos.add(new Aluno(i++, "ALAN CARLOS MONTEIRO"));
		alunos.add(new Aluno(i++, "ALYNE ARAUJO ANSELMO"));
		alunos.add(new Aluno(i++, "ARTHUR VINÍCIUS SOARES CRISPIM"));
		alunos.add(new Aluno(i++, "CAIO CESAR GUERRA LOPES"));
		alunos.add(new Aluno(i++, "CLAUDIO MANOEL CAMELO DA SILVA"));
		alunos.add(new Aluno(i++, "DAVI BARBOSA DOS SANTOS"));
		alunos.add(new Aluno(i++, "DIEGO DE PAULO GOMES TEIXEIRA"));
		alunos.add(new Aluno(i++, "ENZZO MATHEUS DE OLIVEIRA LIMA"));
		alunos.add(new Aluno(i++, "ERICK LUIZ RODRIGUES DE OLIVEIRA"));
		alunos.add(new Aluno(i++, "ESTEFÂNIO EBERSON SILVA DE ARAÚJO"));
		alunos.add(new Aluno(i++, "FABIO ALCANTARA FERNANDES"));
		alunos.add(new Aluno(i++, "FERNANDO HENRIQUE GOMES DOS SANTOS"));
		alunos.add(new Aluno(i++, "FILIPE AUGUSTO COSTA FRAGOSO DE ALBUQUERQUE"));
		alunos.add(new Aluno(i++, "GUILHERME SIQUEIRA PECANHA DA VEIGA"));
		alunos.add(new Aluno(i++, "HANDERSON DOS SANTOS GOMES"));
		alunos.add(new Aluno(i++, "IGOR JACKSON DOS SANTOS"));
		alunos.add(new Aluno(i++, "INALDO COSMO DA SILVA JUNIOR"));
		alunos.add(new Aluno(i++, "ISLEY LIMA DO NASCIMENTO "));
		alunos.add(new Aluno(i++, "JANDERSON GOMES FELISBERTO"));
		alunos.add(new Aluno(i++, "JON ANDERSON DO NASCIMENTO SILVA"));
		alunos.add(new Aluno(i++, "JOSE MARCOS DA SILVA ANDRADE"));
		alunos.add(new Aluno(i++, "LUCAS VASCONCELOS DE MORAIS"));
		alunos.add(new Aluno(i++, "MARDEN BARROS"));
		alunos.add(new Aluno(i++, "MARIA DE FATIMA LUCENA DE OLIVEIRA"));
		alunos.add(new Aluno(i++, "MAXWELL KENNED DA COSTA SILVA"));
		return alunos;

	}

}
