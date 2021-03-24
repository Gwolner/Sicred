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

public class ClienteNegocioTest {
	
	@Test
	public void registroDeClienteComDadosCorretos() {
		Cliente cliente = new Cliente("Joeslei Silva Dias Costa Pereira",
				59230929050L, 307160683, "SDS", "04/08/1987", "Jaboatão",
				"Viúvo", "Masculino", "Ajudante de Cozinha", 
				"R. Evaristo, 296 - Alto so Céu. 54230-087", 
				"jsd.costa@gmail.com", "Brasileiro");
		ClienteRepositorio clienRepo = new ClienteRepositorio();
		ClienteNegocio clienteNegocio = new ClienteNegocio(clienRepo);
		
		boolean retorno = clienteNegocio.adicionarCliente(cliente);
		assertTrue(retorno);		
	}
	
	@Test
	public void registroDeClienteComRGInvalido() {
		Cliente cliente = new Cliente("Joeslei Silva Dias Costa Pereira",
				59230929050L, -307160683, "SDS", "04/08/1987", "Jaboatão",
				"Viúvo", "Masculino", "Ajudante de Cozinha", 
				"R. Evaristo, 296 - Alto so Céu. 54230-087", 
				"jsd.costa@gmail.com", "Brasileiro");
		ClienteRepositorio clienRepo = new ClienteRepositorio();
		ClienteNegocio clienteNegocio = new ClienteNegocio(clienRepo);
		
		boolean retorno = clienteNegocio.adicionarCliente(cliente);
		assertFalse(retorno);		
	}
	
	@Test
	public void registroDeClienteComCPFInvalido() {
		Cliente cliente = new Cliente("Joeslei Silva Dias Costa Pereira",
				-59230929050L, 307160683, "SDS", "04/08/1987", "Jaboatão",
				"Viúvo", "Masculino", "Ajudante de Cozinha", 
				"R. Evaristo, 296 - Alto so Céu. 54230-087", 
				"jsd.costa@gmail.com", "Brasileiro");
		ClienteRepositorio clienRepo = new ClienteRepositorio();
		ClienteNegocio clienteNegocio = new ClienteNegocio(clienRepo);
		
		boolean retorno = clienteNegocio.adicionarCliente(cliente);
		assertFalse(retorno);		
	}
	
	@Test
	public void editarNomeDoCliente() {
		Cliente cliente = new Cliente("Joeslei Silva Dias Costa Pereira",
				59230929050L, 307160683, "SDS", "04/08/1987", "Jaboatão",
				"Viúvo", "Masculino", "Ajudante de Cozinha", 
				"R. Evaristo, 296 - Alto so Céu. 54230-087", 
				"jsd.costa@gmail.com", "Brasileiro");
		ClienteRepositorio clienRepo = new ClienteRepositorio();
		ClienteNegocio clienteNegocio = new ClienteNegocio(clienRepo);
		
		clienteNegocio.adicionarCliente(cliente);
		String retorno = clienteNegocio.atualizarNomeCliente(cliente, "Joeslei Silva Dias da Costa");
		assertEquals("Joeslei Silva Dias da Costa", retorno);	
	}
	
	@Test
	public void editaCPFDoCliente() {
		Cliente cliente = new Cliente("Joeslei Silva Dias Costa Pereira",
				59230929050L, 307160683, "SDS", "04/08/1987", "Jaboatão",
				"Viúvo", "Masculino", "Ajudante de Cozinha", 
				"R. Evaristo, 296 - Alto so Céu. 54230-087", 
				"jsd.costa@gmail.com", "Brasileiro");
		ClienteRepositorio clienRepo = new ClienteRepositorio();
		ClienteNegocio clienteNegocio = new ClienteNegocio(clienRepo);
		
		clienteNegocio.adicionarCliente(cliente);
		long retorno = clienteNegocio.atualizarCPFCliente(cliente, 84217929050L);
		assertEquals(84217929050L, retorno);	
	}
	
	@Test
	public void editaRGDoCliente() {
		Cliente cliente = new Cliente("Joeslei Silva Dias Costa Pereira",
				59230929050L, 307160683, "SDS", "04/08/1987", "Jaboatão",
				"Viúvo", "Masculino", "Ajudante de Cozinha", 
				"R. Evaristo, 296 - Alto so Céu. 54230-087", 
				"jsd.costa@gmail.com", "Brasileiro");
		ClienteRepositorio clienRepo = new ClienteRepositorio();
		ClienteNegocio clienteNegocio = new ClienteNegocio(clienRepo);
		
		clienteNegocio.adicionarCliente(cliente);
		int retorno = clienteNegocio.atualizarRGCliente(cliente, 574164214);
		assertEquals(574164214, retorno);	
	}
	
	@Test
	public void editaEmailDoCliente() {
		Cliente cliente = new Cliente("Joeslei Silva Dias Costa Pereira",
				59230929050L, 307160683, "SDS", "04/08/1987", "Jaboatão",
				"Viúvo", "Masculino", "Ajudante de Cozinha", 
				"R. Evaristo, 296 - Alto so Céu. 54230-087", 
				"jsd.costa@gmail.com", "Brasileiro");
		ClienteRepositorio clienRepo = new ClienteRepositorio();
		ClienteNegocio clienteNegocio = new ClienteNegocio(clienRepo);
		
		clienteNegocio.adicionarCliente(cliente);
		String retorno = clienteNegocio.atualizarEmailCliente(cliente, "joeslei.costa@hotmail.com");
		assertEquals("joeslei.costa@hotmail.com", retorno);	
	}

	
	@Test
	public void consultarClientePeloCPF() {
		Cliente cliente = new Cliente("Joeslei Silva Dias Costa Pereira",
				59230929050L, 307160683, "SDS", "04/08/1987", "Jaboatão",
				"Viúvo", "Masculino", "Ajudante de Cozinha", 
				"R. Evaristo, 296 - Alto so Céu. 54230-087", 
				"jsd.costa@gmail.com", "Brasileiro");
		ClienteRepositorio clienRepo = new ClienteRepositorio();
		ClienteNegocio clienteNegocio = new ClienteNegocio(clienRepo);
		
		clienteNegocio.adicionarCliente(cliente);
		Cliente retorno = clienteNegocio.consultarClientePeloCPF(cliente.getCpf());
		assertNotNull(retorno);
		assertEquals(59230929050L, retorno.getCpf());
	}
	
	@Test
	public void deletarClientePeloCPF() {
		Cliente cliente = new Cliente("Joeslei Silva Dias Costa Pereira",
				59230929050L, 307160683, "SDS", "04/08/1987", "Jaboatão",
				"Viúvo", "Masculino", "Ajudante de Cozinha", 
				"R. Evaristo, 296 - Alto so Céu. 54230-087", 
				"jsd.costa@gmail.com", "Brasileiro");
		ClienteRepositorio clienRepo = new ClienteRepositorio();
		ClienteNegocio clienteNegocio = new ClienteNegocio(clienRepo);
		
		clienteNegocio.adicionarCliente(cliente);
		Cliente retorno = clienteNegocio.consultarClientePeloCPF(cliente.getCpf());
		assertNotNull(retorno);
		Cliente excluido = clienteNegocio.deletarClientePeloCPF(retorno.getCpf());
		assertNull(excluido);
	}
}
