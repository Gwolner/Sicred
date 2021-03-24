package sicred.repositorio;

import java.util.ArrayList;
import java.util.List;

import sicred.model.Cliente;

public class ClienteRepositorio {

	private List<Cliente> clientes;
	
	public ClienteRepositorio() {
		this.clientes = new ArrayList<Cliente>();
	}
	
	public boolean addCliente(Cliente c) {
		try {
			this.clientes.add(c);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
	
	public Cliente buscarPorCPF(long cpf) {
		Cliente c = null;
		for (Cliente cli : this.clientes) {
			if (cli.getCpf() == cpf){
				c = cli;
			}
		}		
		return c; 
	}
	
	public Cliente buscarPorRG(int rg) {
		Cliente c = null;
		for (Cliente cli : this.clientes) {
			if (cli.getRg() == rg){
				c = cli;
			}
		}		
		return c;
	}
	
	public boolean deletarCliente(Cliente cliente) {
		return clientes.remove(cliente);		
	}
	
	public List<Cliente> exibirTodosOsClientes() {
		return this.clientes;
	}
}
