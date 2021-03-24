package test.sicred;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sicred.model.*;
import sicred.negocio.*;
import sicred.repositorio.*;

public class ContratoNegocioTest {

	@Test
	public void registroDeContratoComDadosCorretos() {
		Cliente cliente = new Cliente("Joeslei Silva Dias Costa Pereira",
				59230929050L, 307160683, "SDS", "04/08/1987", "Jaboatão",
				"Viúvo", "Masculino", "Ajudante de Cozinha", 
				"R. Evaristo, 296 - Alto so Céu. 54230-087", 
				"jsd.costa@gmail.com", "Brasileiro");
		Convenente convenente = new Convenente("Walkova");
		
		Contrato contrato = new Contrato(cliente, convenente, "658-UT", 
				"Consignação", 26000.00, 24786.34, 0.3, "12/02/2021", 
				"14/05/2021", "14/10/2021", 6, 4.334);
		ContratoRepositorio contraRepo = new ContratoRepositorio();
		ContratoNegocio contratoNegocio = new ContratoNegocio(contraRepo);
		
		boolean retorno = contratoNegocio.adicionarContrato(contrato);
		assertTrue(retorno);
		assertEquals("Joeslei Silva Dias Costa Pereira", contrato.getCliente().getNome());
		assertEquals("Walkova", contrato.getConvenente().getNome());
		assertEquals(24786.01, contrato.getValorLiquido(), 0.34);
	}
}
