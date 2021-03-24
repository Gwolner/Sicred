package sicred.repositorio;

import java.util.ArrayList;
import java.util.List;

import sicred.model.CodigoUnico;

public class CodigoUnicoRepositorio {
	
	private List<CodigoUnico> codigosUnicos;
	
	public CodigoUnicoRepositorio() {
		this.codigosUnicos = new ArrayList<CodigoUnico>();
	}
	
	public boolean addCodigoUnico(CodigoUnico cou) {
		try {
			this.codigosUnicos.add(cou);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
	
	public CodigoUnico buscarPorCodigoUnico(String codigoUnico) {
		CodigoUnico cou = null;
		for (CodigoUnico cunico : this.codigosUnicos) {
			if (cunico.getCodigoUnico().equals(codigoUnico)){
				cou = cunico;
			}
		}		
		return cou;
	}
	
	public boolean deletarCodigoUnico(CodigoUnico codigosUnico) {
		return codigosUnicos.remove(codigosUnico);		
	}
	
	public List<CodigoUnico> exibirTodosOsCodigosUnicos() {
		return this.codigosUnicos;
	}
}
