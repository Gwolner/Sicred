package test.sicred;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import sicred.model.Cliente;
import sicred.model.CodigoUnico;
import sicred.model.Convenente;
import sicred.negocio.CodigoUnicoNegocio;
import sicred.repositorio.CodigoUnicoRepositorio;

public class CodigoUnicoNegocioTest {

	@Test
	public void consultarClienteEConvenentePeloCodigoUnico() {
		Cliente cliente = new Cliente("Joeslei Silva Dias Costa Pereira",
				59230929050L, 307160683, "SDS", "04/08/1987", "Jaboatão",
				"Viúvo", "Masculino", "Ajudante de Cozinha", 
				"R. Evaristo, 296 - Alto so Céu. 54230-087", 
				"jsd.costa@gmail.com", "Brasileiro");
		Convenente coUenente = new Convenente("Walkova");
		
		CodigoUnico coU = new CodigoUnico("9875-4878-5497-54", cliente, coUenente);
		CodigoUnicoRepositorio coURepo = new CodigoUnicoRepositorio();
		CodigoUnicoNegocio coUNegocio = new CodigoUnicoNegocio(coURepo);
		
		coUNegocio.adicionarCodigoUnico(coU);
		CodigoUnico retornoCodigoUnico = coUNegocio.consultarCodigoUnico(coU.getCodigoUnico());
		assertNotNull(retornoCodigoUnico);
		assertEquals("Joeslei Silva Dias Costa Pereira", retornoCodigoUnico.getCliente().getNome());
		assertEquals("Walkova", retornoCodigoUnico.getConvenente().getNome());
	}
	
	@Test
	public void consultarClienteEConvenentePeloCodigoUnicoInvalido() {
		Cliente cliente = new Cliente("Joeslei Silva Dias Costa Pereira",
				59230929050L, 307160683, "SDS", "04/08/1987", "Jaboatão",
				"Viúvo", "Masculino", "Ajudante de Cozinha", 
				"R. Evaristo, 296 - Alto so Céu. 54230-087", 
				"jsd.costa@gmail.com", "Brasileiro");
		Convenente coUenente = new Convenente("Walkova");
		
		CodigoUnico coU = new CodigoUnico(null, cliente, coUenente);
		CodigoUnicoRepositorio coURepo = new CodigoUnicoRepositorio();
		CodigoUnicoNegocio coUNegocio = new CodigoUnicoNegocio(coURepo);
		
		coUNegocio.adicionarCodigoUnico(coU);
		CodigoUnico retorno = coUNegocio.consultarCodigoUnico(coU.getCodigoUnico());
		assertNull(retorno);
	}
}
