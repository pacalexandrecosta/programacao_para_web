package nassau.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import nassau.model.Aluno;
import nassau.dao.BD;

public class AlunoDAO {

	public Aluno inserir(String nome) throws ClassNotFoundException, SQLException {
		Aluno a = null;
		Connection c = BD.instancia().getConexao();

		String sqlInsert = "INSERT INTO Aluno(nome) values(?)";
		PreparedStatement ps = c.prepareStatement(sqlInsert ,  Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, nome);
		ps.executeUpdate();
		ResultSet rs  = ps.getGeneratedKeys();
		if (rs.next()) {
			a = new Aluno(rs.getInt(1), nome);
		}
		BD.instancia().fecharConexao();
		return a;
	}

	public void deletar(int id) throws ClassNotFoundException, SQLException {
		Connection c = BD.instancia().getConexao();
		String sqlDelete = "delete from Aluno where id =?";
		PreparedStatement ps = c.prepareStatement(sqlDelete);
		ps.setInt(1, id);
		ps.executeUpdate();
		BD.instancia().fecharConexao();
	}

	public void atualizar(int id, String novoNome) throws ClassNotFoundException, SQLException {
		Connection c = BD.instancia().getConexao();
		String sqlUpdate = "update Aluno set nome= ? where id =?";
		PreparedStatement ps = c.prepareStatement(sqlUpdate);
		ps.setString(1, novoNome);
		ps.setInt(2, id);
		ps.executeUpdate();
		BD.instancia().fecharConexao();
	}

	public List<Aluno> getAlunos()  throws ClassNotFoundException, SQLException {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		Connection c = BD.instancia().getConexao();
		String sqlSelect = "select id,nome from Aluno order by nome";
		PreparedStatement ps = c.prepareStatement(sqlSelect);
		ResultSet rs = ps.executeQuery();
	
		while(rs.next()){
			int id = rs.getInt("id");
			String nome = rs.getString("nome");
			Aluno a = new Aluno(id,  nome);
			alunos.add(a);
		}
		BD.instancia().fecharConexao();
		return alunos;
	}
	public Aluno getAlunoById(int idBusca)  throws ClassNotFoundException, SQLException {
		Aluno aluno= null;
		
		Connection c = BD.instancia().getConexao();
		String sqlSelect = "select id,nome from Aluno where id=?";
		PreparedStatement ps = c.prepareStatement(sqlSelect);
		ps.setInt(1, idBusca);
		ResultSet rs = ps.executeQuery();
	
		while(rs.next()){
			int id = rs.getInt("id");
			String nome = rs.getString("nome");
			aluno = new Aluno(id,  nome);
		}
		BD.instancia().fecharConexao();
		return aluno;
		
	}
	

}
