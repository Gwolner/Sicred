package sicred.repositorio;

import java.util.ArrayList;
import java.util.List;

import sicred.model.InstituicaoFinanceira;

public class InstituicaoFinanceiraRepositorio {

	private List<InstituicaoFinanceira> instFinanceiras;
	
	public InstituicaoFinanceiraRepositorio() {
		this.instFinanceiras = new ArrayList<InstituicaoFinanceira>();
	}
	
	public boolean addInstituicaoFinanceira(InstituicaoFinanceira iFin) {
		try {
			this.instFinanceiras.add(iFin);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
	
	public InstituicaoFinanceira buscarPorNome(String nome) {
		InstituicaoFinanceira iFin = null;
		for (InstituicaoFinanceira user : this.instFinanceiras) {
			if (user.getNome().equals(nome)){
				iFin = user;
			}
		}		
		return iFin;
	}	
	
	public InstituicaoFinanceira buscarPorCodigoBancario(String codigoBancario) {
		InstituicaoFinanceira iFin = null;
		for (InstituicaoFinanceira user : this.instFinanceiras) {
			if (user.getCodigoBancario().equals(codigoBancario)){
				iFin = user;
			}
		}		
		return iFin;
	}
	
	public boolean deletarInstituicaoFinanceira(InstituicaoFinanceira iFin) {
		return instFinanceiras.remove(iFin);		
	}
	
	public List<InstituicaoFinanceira> exibirTodasAsInstituicaoFinanceiras() {
		return this.instFinanceiras;
	}
	
}
