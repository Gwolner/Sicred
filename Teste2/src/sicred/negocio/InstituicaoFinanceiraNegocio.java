package sicred.negocio;

import java.util.List;

import sicred.model.InstituicaoFinanceira;
import sicred.repositorio.InstituicaoFinanceiraRepositorio;

public class InstituicaoFinanceiraNegocio {

	private InstituicaoFinanceiraRepositorio infinRepo;
	
	public InstituicaoFinanceiraNegocio(InstituicaoFinanceiraRepositorio infinRepo) {
		this.infinRepo = infinRepo;
	}
	
	//CREATE
	public boolean adicionarInstituicaoFinanceira(InstituicaoFinanceira infin){
		boolean adicionado = false;
		if (infin.getNome() != null && infin.getCodigoBancario() != null){
				adicionado = this.infinRepo.addInstituicaoFinanceira(infin);
		}
		return adicionado;
	}
	
	//READ
	public List<InstituicaoFinanceira> relatorioDadosInstituicaoFinanceiras() {
		return infinRepo.exibirTodasAsInstituicaoFinanceiras();
	}
	
	public InstituicaoFinanceira consultarInstituicaoFinanceiraPorNome(String nome){
		return infinRepo.buscarPorNome(nome);
	}
	
	public InstituicaoFinanceira consultarInstituicaoFinanceiraPeloCodigoBancario(String codigoBancario){
		return infinRepo.buscarPorCodigoBancario(codigoBancario);
	}
	
	//DELETE
	public InstituicaoFinanceira deletarInstituicaoFinanceira(String codigoBancario){
		InstituicaoFinanceira infin = infinRepo.buscarPorCodigoBancario(codigoBancario);
		if(infin != null) {
			if(infinRepo.addInstituicaoFinanceira(infin)) {
				infin = null;
			}
		}		
		return infin;
	}
	
	//UPDATE
	public String atualizarNomeInstituicaoFinanceira(InstituicaoFinanceira inf, String novoNome){
		InstituicaoFinanceira infin = infinRepo.buscarPorCodigoBancario(inf.getCodigoBancario());
		if(infin != null) {
			infin.setNome(novoNome);			
		}
		return infin.getNome();
	}
}
