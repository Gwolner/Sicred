package test.sicred;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sicred.model.*;
import sicred.negocio.*;
import sicred.repositorio.*;

public class GerenteNegocioTest {

	@Test
	public void cadastrarGerenteDoTipoGerenteComDadosValidos() {
		Gerente gerente = new Gerente("Amanda Souza Cruz", 2467638, "ASC", "@$C", "Gerente", "Vendas", "AV011");
		GerenteRepositorio gerRepo = new GerenteRepositorio();
		GerenteNegocio gerenteNegocio = new GerenteNegocio(gerRepo);
		
		boolean retorno = gerenteNegocio.adicionarGerente(gerente);
		assertTrue(retorno);		
	}
	
	@Test
	public void cadastrarGerenteDoTipoGerenteComNomeInvalido() {
		Gerente gerente = new Gerente(null, 2467638, "ASC", "@$C", "Gerente", "Vendas", "AV011");
		GerenteRepositorio gerRepo = new GerenteRepositorio();
		GerenteNegocio gerenteNegocio = new GerenteNegocio(gerRepo);
		
		boolean retorno = gerenteNegocio.adicionarGerente(gerente);
		assertFalse(retorno);		
	}
	
	@Test
	public void cadastrarGerenteDoTipoGerenteComMatriculaInvalida() {
		Gerente gerente = new Gerente("Amanda Souza Cruz", -2467638, "ASC", "@$C", "Gerente", "Vendas", "AV011");
		GerenteRepositorio gerRepo = new GerenteRepositorio();
		GerenteNegocio gerenteNegocio = new GerenteNegocio(gerRepo);
		
		boolean retorno = gerenteNegocio.adicionarGerente(gerente);
		assertFalse(retorno);		
	}
	
	@Test
	public void cadastrarGerenteDoTipoGerenteComLoginInvalida() {
		Gerente gerente = new Gerente("Amanda Souza Cruz", 2467638, null, "@$C", "Gerente", "Vendas", "AV011");
		GerenteRepositorio gerRepo = new GerenteRepositorio();
		GerenteNegocio gerenteNegocio = new GerenteNegocio(gerRepo);
		
		boolean retorno = gerenteNegocio.adicionarGerente(gerente);
		assertFalse(retorno);		
	}
	
	@Test
	public void cadastrarGerenteDoTipoGerenteComSenhaInvalida() {
		Gerente gerente = new Gerente("Amanda Souza Cruz", 2467638, "ASC", null, "Gerente", "Vendas", "AV011");
		GerenteRepositorio gerRepo = new GerenteRepositorio();
		GerenteNegocio gerenteNegocio = new GerenteNegocio(gerRepo);
		
		boolean retorno = gerenteNegocio.adicionarGerente(gerente);
		assertFalse(retorno);		
	}
	
	@Test
	public void cadastrarGerenteDoTipoGerenteSemDiretoriaDefinida() {
		Gerente gerente = new Gerente("Amanda Souza Cruz", 2467638, "ASC", "@$C", "Gerente", null, "AV011");
		GerenteRepositorio gerRepo = new GerenteRepositorio();
		GerenteNegocio gerenteNegocio = new GerenteNegocio(gerRepo);
		
		boolean retorno = gerenteNegocio.adicionarGerente(gerente);
		assertFalse(retorno);		
	}
	
	@Test
	public void cadastrarGerenteDoTipoGerenteSemFilialDefinida() {
		Gerente gerente = new Gerente("Amanda Souza Cruz", 2467638, "ASC", "@$C", "Gerente", "Vendas", null);
		GerenteRepositorio gerRepo = new GerenteRepositorio();
		GerenteNegocio gerenteNegocio = new GerenteNegocio(gerRepo);
		
		boolean retorno = gerenteNegocio.adicionarGerente(gerente);
		assertFalse(retorno);		
	}
	
}
