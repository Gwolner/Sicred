package sicred.repositorio;

import java.util.ArrayList;
import java.util.List;

import sicred.model.Usuario;


public class UsuarioRepositorio {

	private List<Usuario> usuarios;
	
	public UsuarioRepositorio() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public boolean addUsuario(Usuario u) {
		try {
			this.usuarios.add(u);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
	
	public Usuario buscarPorMatricula(int matricula) {
		Usuario u = null;
		for (Usuario user : this.usuarios) {
			if (user.getMatricula() == matricula) {
				u = user;
			}
		}		
		return u;
	}
	
	public boolean deletarUsuario(Usuario usuario) {
		return usuarios.remove(usuario);		
	}
	
	public List<Usuario> exibirTodosOsUsuarios() {
		return this.usuarios;
	}
}
