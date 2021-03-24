package sicred.model;

public class InstituicaoFinanceira {

	private String nome;
	private String codigoBancario;
	
	public InstituicaoFinanceira(String nome, String codigoBancario){
		this.nome = nome;
		this.codigoBancario = codigoBancario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoBancario() {
		return codigoBancario;
	}

	public void setCodigoBancario(String codigoBancario) {
		this.codigoBancario = codigoBancario;
	}

	
	
}
