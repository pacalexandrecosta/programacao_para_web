package nassau.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {
	private static final String DB_DRIVER = "org.postgresql.Driver";
	private static final String DB_CONNECTION = "jdbc:postgresql://localhost:5432/029";
	private static final String DB_USER = "postgres";
	private static final String DB_PASSWORD = "123456";

	private static BD instancia = new BD();
	private Connection conexao = null;

	private Connection obtemConexao() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection connection = null;
		connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
		return connection;
	}

	public Connection getConexao() throws ClassNotFoundException, SQLException {
		if (conexao == null)
			conexao = obtemConexao();
		return conexao;
	}

	public void fecharConexao() throws SQLException {
		if (conexao != null){
			conexao.close();
			conexao=null;
		}
	}

	public static BD instancia() {
		return instancia;
	}

}
