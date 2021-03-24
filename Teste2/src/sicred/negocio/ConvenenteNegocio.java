package sicred.negocio;

import java.util.List;

import sicred.model.Convenente;
import sicred.repositorio.ConvenenteRepositorio;

public class ConvenenteNegocio {
	
	private ConvenenteRepositorio convRepo;
	
	public ConvenenteNegocio(ConvenenteRepositorio usRepo) {
		this.convRepo = usRepo;
	}
	
	//CREATE
	public boolean adicionarConvenente(Convenente c){
		boolean adicionado = false;
		if (c.getNome() != null) {
				adicionado = this.convRepo.addConvenente(c);
		}
		return adicionado;
	}
	
	//READ
	public List<Convenente> relatorioDadosConvenentes() {
		return convRepo.exibirTodasAsConvenentes();
	}
	
	public Convenente consultarConvenente(String nome){
		return convRepo.buscarPorNome(nome);
	}
	
	//DELETE
	public Convenente deletarConvenente(String nome){
		Convenente conv = convRepo.buscarPorNome(nome);
		if(conv != null) {
			if(convRepo.deletarConvenente(conv)) {
				conv = null;
			}
		}		
		return conv;
	}
	
	//UPDATE
	public String atualizarNomeConvenente(Convenente c, String novoNome){
		Convenente conv = convRepo.buscarPorNome(c.getNome());
		if(conv != null) {
			conv.setNome(novoNome);			
		}
		return conv.getNome();
	}
}
