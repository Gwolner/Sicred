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

public class ConvenenteNegocioTest {
	
	@Test
	public void cadastrarConvenenteComDadosCorretos() {
		InstituicaoFinanceira nubank = new InstituicaoFinanceira("Nubank", "98754/878-5497/54");
		InstituicaoFinanceira itau = new InstituicaoFinanceira("ITAU", "77754/568-3497/19");		
		Convenente convenente = new Convenente("Walkova");
		convenente.setConveniadas(nubank);
		convenente.setConveniadas(itau);
		ConvenenteRepositorio convRepo = new ConvenenteRepositorio();
		ConvenenteNegocio convenenteNegocio = new ConvenenteNegocio(convRepo);
		
		boolean retorno = convenenteNegocio.adicionarConvenente(convenente);
		assertTrue(retorno);		
	}
	
	@Test
	public void cadastrarConvenenteComNomeIncorreto() {
		InstituicaoFinanceira nubank = new InstituicaoFinanceira("Nubank", "98754/878-5497/54");
		InstituicaoFinanceira itau = new InstituicaoFinanceira("ITAU", "77754/568-3497/19");		
		Convenente convenente = new Convenente(null);
		convenente.setConveniadas(nubank);
		convenente.setConveniadas(itau);
		ConvenenteRepositorio convRepo = new ConvenenteRepositorio();
		ConvenenteNegocio convenenteNegocio = new ConvenenteNegocio(convRepo);
		
		boolean retorno = convenenteNegocio.adicionarConvenente(convenente);
		assertFalse(retorno);		
	}
	
	@Test
	public void editarNomeDaConvenente() {
		InstituicaoFinanceira nubank = new InstituicaoFinanceira("Nubank", "98754/878-5497/54");
		InstituicaoFinanceira itau = new InstituicaoFinanceira("ITAU", "77754/568-3497/19");		
		Convenente convenente = new Convenente("Walkova");
		convenente.setConveniadas(nubank);
		convenente.setConveniadas(itau);
		ConvenenteRepositorio convRepo = new ConvenenteRepositorio();
		ConvenenteNegocio convenenteNegocio = new ConvenenteNegocio(convRepo);
		
		convenenteNegocio.adicionarConvenente(convenente);
		String retorno = convenenteNegocio.atualizarNomeConvenente(convenente, "Walkova Company");
		assertEquals("Walkova Company", retorno);	
	}
	
	@Test
	public void consultarConvenentePeloNome() {
		InstituicaoFinanceira nubank = new InstituicaoFinanceira("Nubank", "98754/878-5497/54");
		InstituicaoFinanceira itau = new InstituicaoFinanceira("ITAU", "77754/568-3497/19");		
		Convenente convenente = new Convenente("Walkova");
		convenente.setConveniadas(nubank);
		convenente.setConveniadas(itau);
		ConvenenteRepositorio convRepo = new ConvenenteRepositorio();
		ConvenenteNegocio convenenteNegocio = new ConvenenteNegocio(convRepo);
		
		convenenteNegocio.adicionarConvenente(convenente);
		Convenente retorno = convenenteNegocio.consultarConvenente(convenente.getNome());
		assertNotNull(retorno);
		assertEquals("Walkova", retorno.getNome());
	}
	 
	@Test
	public void deletarConvenentePeloNome() {
		InstituicaoFinanceira nubank = new InstituicaoFinanceira("Nubank", "98754/878-5497/54");
		InstituicaoFinanceira itau = new InstituicaoFinanceira("ITAU", "77754/568-3497/19");		
		Convenente convenente = new Convenente("Walkova");
		convenente.setConveniadas(nubank);
		convenente.setConveniadas(itau);
		ConvenenteRepositorio convRepo = new ConvenenteRepositorio();
		ConvenenteNegocio convenenteNegocio = new ConvenenteNegocio(convRepo);
		
		convenenteNegocio.adicionarConvenente(convenente);
		Convenente retorno = convenenteNegocio.consultarConvenente(convenente.getNome());
		assertNotNull(retorno);
		Convenente excluido = convenenteNegocio.deletarConvenente(convenente.getNome());
		assertNull(excluido);
	}
	
}
