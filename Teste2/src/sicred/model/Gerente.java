package sicred.model;

public class Gerente extends Usuario{
	
	private String diretoria;
	private String filial;
	
	public Gerente(String nome, int matricula, String login, String senha, String tipo, String diretoria, String filial) {
		super(nome, matricula, login, senha, tipo);
		this.diretoria = diretoria;
		this.filial = filial;
	}

	public String getDiretoria() {
		return diretoria;
	}

	public void setDiretoria(String diretoria) {
		this.diretoria = diretoria;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}
	
	
}
