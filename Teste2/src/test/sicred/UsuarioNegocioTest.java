package test.sicred;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


import sicred.model.*;
import sicred.negocio.*;
import sicred.repositorio.*;

public class UsuarioNegocioTest {

	@Test
	public void cadastrarUsuarioSemTipoDefinido() {
		Usuario usuario = new Usuario("Jonas Pacheco Alencar", 3464633, "JPA", "147$Frt", null);
		UsuarioRepositorio userRepo = new UsuarioRepositorio();
		UsuarioNegocio usuarioNegocio = new UsuarioNegocio(userRepo);
		
		boolean retorno = usuarioNegocio.adicionarUsuario(usuario);
		assertFalse(retorno);		
	}
	
	@Test
	public void cadastrarUsuarioDoTipoFuncionarioComDadosValidos() {
		Usuario usuario = new Usuario("Jonas Pacheco Alencar", 3464633, "JPA", "147$Frt", "Funcionário");
		UsuarioRepositorio userRepo = new UsuarioRepositorio();
		UsuarioNegocio usuarioNegocio = new UsuarioNegocio(userRepo);
		
		boolean retorno = usuarioNegocio.adicionarUsuario(usuario);
		assertTrue(retorno);		
	}
	
	@Test
	public void cadastrarUsuarioDoTipoFuncionarioComNomeInvalido() {
		Usuario usuario = new Usuario(null, 3464633, "JPA", "147$Frt", "Funcionário");
		UsuarioRepositorio userRepo = new UsuarioRepositorio();
		UsuarioNegocio usuarioNegocio = new UsuarioNegocio(userRepo);
		
		boolean retorno = usuarioNegocio.adicionarUsuario(usuario);
		assertFalse(retorno);		
	}	
	
	@Test
	public void cadastrarUsuarioDoTipoFuncionarioComMatriculaInvalida() {
		Usuario usuario = new Usuario("Jonas Pacheco Alencar", -9548578, "JPA", "147$Frt", "Funcionário");
		UsuarioRepositorio userRepo = new UsuarioRepositorio();
		UsuarioNegocio usuarioNegocio = new UsuarioNegocio(userRepo);
		
		boolean retorno = usuarioNegocio.adicionarUsuario(usuario);
		assertFalse(retorno);		
	}
	
	@Test
	public void cadastrarUsuarioDoTipoFuncionarioComLoginInvalido() {
		Usuario usuario = new Usuario("Jonas Pacheco Alencar", 3464633, null, "147$Frt", "Funcionário");
		UsuarioRepositorio userRepo = new UsuarioRepositorio();
		UsuarioNegocio usuarioNegocio = new UsuarioNegocio(userRepo);
		
		boolean retorno = usuarioNegocio.adicionarUsuario(usuario);
		assertFalse(retorno);		
	}
	
	@Test
	public void cadastrarUsuarioDoTipoFuncionarioComSenhaInvalido() {
		Usuario usuario = new Usuario("Jonas Pacheco Alencar", 3464633, "JPA", null, "Funcionário");
		UsuarioRepositorio userRepo = new UsuarioRepositorio();
		UsuarioNegocio usuarioNegocio = new UsuarioNegocio(userRepo);
		
		boolean retorno = usuarioNegocio.adicionarUsuario(usuario);
		assertFalse(retorno);		
	}
}
