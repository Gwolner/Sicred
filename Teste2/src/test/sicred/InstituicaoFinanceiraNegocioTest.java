package test.sicred;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sicred.model.*;
import sicred.negocio.*;
import sicred.repositorio.*;

public class InstituicaoFinanceiraNegocioTest {

	@Test
	public void registroDeInstituicaoFinanceiraComDadosCorretos() {
		InstituicaoFinanceira instFin = new InstituicaoFinanceira("Nubank","98754/878-5497/54");
		InstituicaoFinanceiraRepositorio instFinRepo = new InstituicaoFinanceiraRepositorio();
		InstituicaoFinanceiraNegocio instFinNegocio = new InstituicaoFinanceiraNegocio(instFinRepo);
		
		boolean retorno = instFinNegocio.adicionarInstituicaoFinanceira(instFin);
		assertTrue(retorno);		
	}
	
	@Test
	public void registroDeInstituicaoFinanceiraComNomeIncorreto() {
		InstituicaoFinanceira instFin = new InstituicaoFinanceira(null,"98754/878-5497/54");
		InstituicaoFinanceiraRepositorio instFinRepo = new InstituicaoFinanceiraRepositorio();
		InstituicaoFinanceiraNegocio instFinNegocio = new InstituicaoFinanceiraNegocio(instFinRepo);
		
		boolean retorno = instFinNegocio.adicionarInstituicaoFinanceira(instFin);
		assertFalse(retorno);		
	}
	
	@Test
	public void registroDeInstituicaoFinanceiraComCodigoBancarioInvalido() {
		InstituicaoFinanceira instFin = new InstituicaoFinanceira("Nubank", null);
		InstituicaoFinanceiraRepositorio instFinRepo = new InstituicaoFinanceiraRepositorio();
		InstituicaoFinanceiraNegocio instFinNegocio = new InstituicaoFinanceiraNegocio(instFinRepo);
		
		boolean retorno = instFinNegocio.adicionarInstituicaoFinanceira(instFin);
		assertFalse(retorno);		
	}
	
	@Test
	public void editarNomeDaInstituicaoFinanceira() {
		InstituicaoFinanceira instFin = new InstituicaoFinanceira("Nubank", "98754/878-5497/54");
		InstituicaoFinanceiraRepositorio instFinRepo = new InstituicaoFinanceiraRepositorio();
		InstituicaoFinanceiraNegocio instFinNegocio = new InstituicaoFinanceiraNegocio(instFinRepo);
		
		instFinNegocio.adicionarInstituicaoFinanceira(instFin);
		String retorno = instFinNegocio.atualizarNomeInstituicaoFinanceira(instFin, "Nubank SA");
		assertEquals("Nubank SA", retorno);	
	}
	
	@Test
	public void consultarInstituicaoFinanceiraPorNome() {
		InstituicaoFinanceira instFin = new InstituicaoFinanceira("Nubank", "98754/878-5497/54");
		InstituicaoFinanceiraRepositorio instFinRepo = new InstituicaoFinanceiraRepositorio();
		InstituicaoFinanceiraNegocio instFinNegocio = new InstituicaoFinanceiraNegocio(instFinRepo);
		
		instFinNegocio.adicionarInstituicaoFinanceira(instFin);
		InstituicaoFinanceira retorno = instFinNegocio.consultarInstituicaoFinanceiraPorNome(instFin.getNome());
		assertNotNull(retorno);
		assertEquals("Nubank", retorno.getNome());
	}
	
	@Test
	public void consultarInstituicaoFinanceiraPeloCodigoBancario() {
		InstituicaoFinanceira instFin = new InstituicaoFinanceira("Nubank", "98754/878-5497/54");
		InstituicaoFinanceiraRepositorio instFinRepo = new InstituicaoFinanceiraRepositorio();
		InstituicaoFinanceiraNegocio instFinNegocio = new InstituicaoFinanceiraNegocio(instFinRepo);
		
		instFinNegocio.adicionarInstituicaoFinanceira(instFin);
		InstituicaoFinanceira retorno = instFinNegocio.consultarInstituicaoFinanceiraPeloCodigoBancario(instFin.getCodigoBancario());
		assertNotNull(retorno);
		assertEquals("98754/878-5497/54", retorno.getCodigoBancario());
	}
	
	@Test
	public void consultarInstituicaoFinanceiraPeloCodigoBancarioInvalido() {
		InstituicaoFinanceira instFin = new InstituicaoFinanceira("Nubank", null);
		InstituicaoFinanceiraRepositorio instFinRepo = new InstituicaoFinanceiraRepositorio();
		InstituicaoFinanceiraNegocio instFinNegocio = new InstituicaoFinanceiraNegocio(instFinRepo);
		
		instFinNegocio.adicionarInstituicaoFinanceira(instFin);
		InstituicaoFinanceira retorno = instFinNegocio.consultarInstituicaoFinanceiraPeloCodigoBancario(instFin.getCodigoBancario());
		assertNull(retorno);
	}
	
	@Test
	public void deletarInstituicaoFinanceira() {
		InstituicaoFinanceira instFin = new InstituicaoFinanceira("Nubank", "98754/878-5497/54");
		InstituicaoFinanceiraRepositorio instFinRepo = new InstituicaoFinanceiraRepositorio();
		InstituicaoFinanceiraNegocio instFinNegocio = new InstituicaoFinanceiraNegocio(instFinRepo);
		
		instFinNegocio.adicionarInstituicaoFinanceira(instFin);
		InstituicaoFinanceira retorno = instFinNegocio.consultarInstituicaoFinanceiraPorNome(instFin.getNome());
		assertNotNull(retorno);
		InstituicaoFinanceira excluido = instFinNegocio.deletarInstituicaoFinanceira(instFin.getCodigoBancario());
		assertNull(excluido);
	}
}
