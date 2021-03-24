package sicred.negocio;

import java.util.List;

import sicred.model.Contrato;
import sicred.repositorio.ContratoRepositorio;

public class ContratoNegocio {
	
	private ContratoRepositorio contRepo;
	
	public ContratoNegocio(ContratoRepositorio contRepo) {
		this.contRepo = contRepo;
	}
	
	//CREATE
	public boolean adicionarContrato(Contrato c){
		boolean adicionado = false;
		if (c.getConvenente() != null
			&& c.getCliente() != null
			&& c.getInstrucaoFinanceira() != null
			&& c.getTipo() != null 
			&& c.getValorBruto() > 0
			&& c.getValorLiquido() > 0.0
			&& c.getTaxaMensal() > 0.0
			&& c.getDataConcessao() != null 
			&& c.getVencimentoPrimeiraParcela() != null
			&& c.getVencimentoUltimaParcela() != null 
			&& c.getPrazo() > 0
			&& c.getValorParcela() > 0.0) {
				adicionado = this.contRepo.addContrato(c);
		}
		return adicionado;
	}
	
	//READ
	public List<Contrato> relatorioDadosContratos() {
		return contRepo.exibirTodosOsContratos();
	}
	
	//DELETE
	public Contrato deletarContrato(String instFin){
		Contrato cont = contRepo.buscarPorinstrucaoFinanceira(instFin);
		if(cont != null) {
			if(contRepo.deletarContrato(cont)) {
				cont = null;
			}
		}		
		return cont;
	}
	
	//UPDATE
	//Não adicionei porq não vou precisar usar 
	//e o tempo está apertado para dar conta de tudo!
}
