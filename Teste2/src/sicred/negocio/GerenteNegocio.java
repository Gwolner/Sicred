package sicred.negocio;

import java.util.List;

import sicred.model.Gerente;
import sicred.repositorio.GerenteRepositorio;

public class GerenteNegocio {
	
	private GerenteRepositorio gerRepo;
	
	public GerenteNegocio(GerenteRepositorio geRepo) {
		this.gerRepo = geRepo;
	}
	
	//CREATE
	public boolean adicionarGerente(Gerente g){
		boolean adicionado = false;
		if (g.getNome() != null 
			&& g.getMatricula() > 0
			&& g.getLogin() != null 
			&& g.getSenha() != null 
			&& (g.getTipo().equals("Funcionário") || g.getTipo().equals("Gerente"))
			&& g.getDiretoria() != null 
			&& g.getFilial() != null) {
				adicionado = this.gerRepo.addGerente(g);
		}
		return adicionado;
	}
	
	//READ
	public List<Gerente> relatorioDadosGerentes() {
		return gerRepo.exibirTodosOsGerentes();
	}
	
	//DELETE
	public Gerente deletarGerente(int matricula){
		Gerente ger = gerRepo.buscarPorMatricula(matricula);
		if(ger != null) {
			if(gerRepo.deletarGerente(ger)) {
				ger = null;
			}
		}		
		return ger;
	}
	
	//UPDATE
	public String atualizarNomeGerente(Gerente u, String novoNome){
		Gerente user = gerRepo.buscarPorMatricula(u.getMatricula());
		if(user != null) {
			user.setNome(novoNome);			
		}
		return user.getNome();
	}
	
	public String atualizarLoginGerente(Gerente u, String novoLogin){
		Gerente user = gerRepo.buscarPorMatricula(u.getMatricula());
		if(user != null) {
			user.setLogin(novoLogin);			
		}
		return user.getLogin();
	}
	
	public String atualizarSenhaGerente(Gerente u, String novaSenha){
		Gerente user = gerRepo.buscarPorMatricula(u.getMatricula());
		if(user != null) {
			user.setSenha(novaSenha);			
		}
		return user.getSenha();
	}
	
	public String atualizarDiretoriaGerente(Gerente u, String novaDiretoria){
		Gerente user = gerRepo.buscarPorMatricula(u.getMatricula());
		if(user != null) {
			user.setDiretoria(novaDiretoria);			
		}
		return user.getDiretoria();
	}
	
	public String atualizarFilialGerente(Gerente u, String novaFilial){
		Gerente user = gerRepo.buscarPorMatricula(u.getMatricula());
		if(user != null) {
			user.setFilial(novaFilial);			
		}
		return user.getFilial();
	}
	
}
