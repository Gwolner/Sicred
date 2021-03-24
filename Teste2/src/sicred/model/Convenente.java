package sicred.model;

import java.util.ArrayList;
import java.util.List;

public class Convenente {

	private String nome;
	private List<InstituicaoFinanceira> conveniadas;
	
	public Convenente(String nome) {
		this.nome = nome;
		this.conveniadas = new ArrayList<InstituicaoFinanceira>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<InstituicaoFinanceira> getConveniadas() {
		return conveniadas;
	}

	public void setConveniadas(InstituicaoFinanceira inf) {
		this.conveniadas.add(inf);
	}
	
	
	
}
