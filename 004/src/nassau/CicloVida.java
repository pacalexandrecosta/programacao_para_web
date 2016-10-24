package nassau;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CicloVida extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("Estou no método init");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Estou no método init com parâmetros");
		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println("Estou no método service");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Estou no método doGet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Estou no método doPost");
	}

	@Override
	public void destroy() {
		System.out.println("Estou no método destroy");
		super.destroy();
	}
}
