package sicred.repositorio;

import java.util.ArrayList;
import java.util.List;

import sicred.model.Gerente;

public class GerenteRepositorio {
	
	private List<Gerente> gerentes;
	
	public GerenteRepositorio() {
		this.gerentes = new ArrayList<Gerente>();
	}
	
	public boolean addGerente(Gerente g) {
		try {
			this.gerentes.add(g);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
	
	public Gerente buscarPorMatricula(int matricula) {
		Gerente f = null;
		for (Gerente ger : this.gerentes) {
			if (ger.getMatricula() == matricula){
				f = ger;
			}
		}		
		return f;
	}
	
	
	public boolean deletarGerente(Gerente gerente) {
		return gerentes.remove(gerente);		
	}
	
	public List<Gerente> exibirTodosOsGerentes() {
		return this.gerentes;
	}
}
