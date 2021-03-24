package sicred.negocio;

import java.util.List;
import sicred.model.Usuario;
import sicred.repositorio.UsuarioRepositorio;

public class UsuarioNegocio {
	
	private UsuarioRepositorio userRepo;
	
	public UsuarioNegocio(UsuarioRepositorio usRepo) {
		this.userRepo = usRepo;
	}
	
	//CREATE
	public boolean adicionarUsuario(Usuario u){
		boolean adicionado = false;
		if (u.getNome() != null 
			&& u.getMatricula() > 0
			&& u.getLogin() != null 
			&& u.getSenha() != null
			&& u.getTipo() != null 
			&& (u.getTipo().equals("Funcionário") || u.getTipo().equals("Gerente"))
			&& this.userRepo.buscarPorMatricula(u.getMatricula()) == null) {
				adicionado = this.userRepo.addUsuario(u);
		}
		return adicionado;
	}
	
	//READ
	public List<Usuario> relatorioDadosUsuarios() {
		return userRepo.exibirTodosOsUsuarios();
	}
	
	//DELETE
	public Usuario deletarUsuario(int matricula){
		Usuario user = userRepo.buscarPorMatricula(matricula);
		if(user != null) {
			if(userRepo.deletarUsuario(user)) {
				user = null;
			}
		}		
		return user;
	}
	
	//UPDATE
	public String atualizarNomeUsuario(Usuario u, String novoNome){
		Usuario user = userRepo.buscarPorMatricula(u.getMatricula());
		if(user != null) {
			user.setNome(novoNome);			
		}
		return user.getNome();
	}
	
	public String atualizarLoginUsuario(Usuario u, String novoLogin){
		Usuario user = userRepo.buscarPorMatricula(u.getMatricula());
		if(user != null) {
			user.setLogin(novoLogin);			
		}
		return user.getLogin();
	}
	
	public String atualizarSenhaUsuario(Usuario u, String novaSenha){
		Usuario user = userRepo.buscarPorMatricula(u.getMatricula());
		if(user != null) {
			user.setSenha(novaSenha);			
		}
		return user.getSenha();
	}
	
	public String atualizarTipoUsuario(Usuario u, String novoTipo){
		Usuario user = userRepo.buscarPorMatricula(u.getMatricula());
		if(user != null 
			&& (novoTipo.equals("Funcionário") || novoTipo.equals("Gerente"))) {
				user.setTipo(novoTipo);			
		}
		return user.getTipo();
	}

}
