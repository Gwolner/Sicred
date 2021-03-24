package sicred.model;

public class Usuario {
	
	protected String nome;
	protected int matricula;
	protected String login;
	protected String senha;
	protected String tipo;
	
	public Usuario(String nome, int matricula, String login, String senha, String tipo) {
		this.nome = nome;
		this.matricula = matricula;
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
