package sicred.repositorio;

import java.util.ArrayList;
import java.util.List;

import sicred.model.Convenente;

public class ConvenenteRepositorio {
	
	private List<Convenente> convenentes;
	
	public ConvenenteRepositorio() {
		this.convenentes = new ArrayList<Convenente>();
	}
	
	public boolean addConvenente(Convenente con) {
		try {
			this.convenentes.add(con);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
	
	public Convenente buscarPorNome(String nome) {
		Convenente c = null;
		for (Convenente con : this.convenentes) {
			if (con.getNome().equals(nome)){
				c = con;
			}
		}		
		return c;
	}	
	
	public boolean deletarConvenente(Convenente convenente) {
		return convenentes.remove(convenente);		
	}
	
	public List<Convenente> exibirTodasAsConvenentes() {
		return this.convenentes;
	}
}
