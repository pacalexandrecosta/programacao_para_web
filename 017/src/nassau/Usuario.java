package nassau;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Usuario implements HttpSessionBindingListener {

	private String nome;

	public Usuario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("Usuario foi adicionado à  sessão");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("Usuario foi removido da  sessão");
	}
}
