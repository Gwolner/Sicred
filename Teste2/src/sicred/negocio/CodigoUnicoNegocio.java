package sicred.negocio;

import java.util.List;

import sicred.model.CodigoUnico;
import sicred.repositorio.CodigoUnicoRepositorio;

public class CodigoUnicoNegocio {
	
	private CodigoUnicoRepositorio cunRepo;
	
	public CodigoUnicoNegocio(CodigoUnicoRepositorio cunRepo) {
		this.cunRepo = cunRepo;
	}
	
	//CREATE
	public boolean adicionarCodigoUnico(CodigoUnico cun){
		boolean adicionado = false;
		if (cun.getCliente() != null 
			&& cun.getConvenente() != null 
			&& cun.getCodigoUnico() != null		
			&& this.cunRepo.buscarPorCodigoUnico(cun.getCodigoUnico()) == null) {
				adicionado = this.cunRepo.addCodigoUnico(cun);
		}
		return adicionado;
	}
	
	//READ
	public List<CodigoUnico> relatorioDadosCodigosUnicos() {
		return cunRepo.exibirTodosOsCodigosUnicos();
	}
	
	public CodigoUnico consultarCodigoUnico(String codigoUnico){
		return cunRepo.buscarPorCodigoUnico(codigoUnico);		
	}
	
	//DELETE
	public CodigoUnico deletarCodigoUnico(String codigoUnico){
		CodigoUnico cou = cunRepo.buscarPorCodigoUnico(codigoUnico);
		if(cou != null) {
			if(cunRepo.deletarCodigoUnico(cou)) {
				cou = null;
			}
		}		
		return cou;
	}
	
	//UPDATE
	//Uma vez gerado, o código único não é alterado. 
	//É a mesma lógica de tentar alterar a matrícula de um funcionário...
}
