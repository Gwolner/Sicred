package sicred.repositorio;

import java.util.ArrayList;
import java.util.List;

import sicred.model.Contrato;

public class ContratoRepositorio {
	
	private List<Contrato> contratos;
	
	public ContratoRepositorio() {
		this.contratos = new ArrayList<Contrato>();
	}
	
	public boolean addContrato(Contrato con) {
		try {
			this.contratos.add(con);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
	
	public Contrato buscarPorinstrucaoFinanceira(String instFin) {
		Contrato c = null;
		for (Contrato con : this.contratos) {
			if (con.getInstrucaoFinanceira().equals(instFin)){
				c = con;
			}
		}		
		return c;
	}	
	
	public boolean deletarContrato(Contrato contrato) {
		return contratos.remove(contrato);		
	}
	
	public List<Contrato> exibirTodosOsContratos() {
		return this.contratos;
	}
}
