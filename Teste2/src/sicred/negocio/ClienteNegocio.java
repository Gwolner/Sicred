package sicred.negocio;

import java.util.List;

import sicred.model.Cliente;
import sicred.repositorio.ClienteRepositorio;

public class ClienteNegocio {
	
private ClienteRepositorio clienRepo;
	
	public ClienteNegocio(ClienteRepositorio usRepo) {
		this.clienRepo = usRepo;
	}
	
	//CREATE
	public boolean adicionarCliente(Cliente clie){
		boolean adicionado = false;
		if (clie.getNome() != null 
			&& clie.getCpf() > 0L
			&& clie.getRg() > 0 
			&& clie.getFiliacao()!= null
			&& clie.getNascimento()!= null
			&& clie.getNaturalidade()!= null
			&& clie.getEstadoCivil() != null
			&& clie.getSexo()!= null
			&& clie.getProfissao() != null
			&& clie.getEndereco()!= null
			&& clie.getEmail()!= null
			&& clie.getNacionalidade() != null
			&& this.clienRepo.buscarPorCPF(clie.getCpf()) == null
			&& this.clienRepo.buscarPorRG(clie.getRg()) == null) {
				adicionado = this.clienRepo.addCliente(clie);
		}
		return adicionado;
	}
	
	//READ
	public List<Cliente> relatorioDadosClientes() {
		return clienRepo.exibirTodosOsClientes();
	}
	
	public Cliente consultarClientePeloCPF(long cpf){
		return clienRepo.buscarPorCPF(cpf);
	}
	
	//DELETE
	public Cliente deletarClientePeloCPF(long cpf){
		Cliente clien = clienRepo.buscarPorCPF(cpf);
		if(clien != null) {
			if(clienRepo.deletarCliente(clien)) {
				clien = null;
			}
		}		
		return clien;
	}
	
	public Cliente deletarClientePeloRG(int rg){
		Cliente clien = clienRepo.buscarPorRG(rg);
		if(clien != null) {
			if(clienRepo.deletarCliente(clien)) {
				clien = null;
			}
		}		
		return clien;
	}
	
	//UPDATE
	public String atualizarNomeCliente(Cliente c, String novoNome){
		Cliente clien = clienRepo.buscarPorCPF(c.getCpf());
		if(clien != null) {
			clien.setNome(novoNome);			
		}
		return clien.getNome();
	}
	
	public long atualizarCPFCliente(Cliente c, long novoCPF){
		Cliente clien = clienRepo.buscarPorCPF(c.getCpf());
		if(clien != null) {
			clien.setCpf(novoCPF);			
		}
		return clien.getCpf();
	}
	
	public int atualizarRGCliente(Cliente c, int novoRG){
		Cliente clien = clienRepo.buscarPorCPF(c.getCpf());
		if(clien != null) {
			clien.setRg(novoRG);
		}
		return clien.getRg();
	}
	
	public String atualizarFiliacaoCliente(Cliente c, String novaFiliacao){
		Cliente clien = clienRepo.buscarPorCPF(c.getCpf());
		if(clien != null) {
			clien.setFiliacao(novaFiliacao);			
		}
		return clien.getNome();
	}
	
	public String atualizarNascimentoCliente(Cliente c, String novoNascimento){
		Cliente clien = clienRepo.buscarPorCPF(c.getCpf());
		if(clien != null) {
			clien.setNascimento(novoNascimento);			
		}
		return clien.getNascimento();
	}
	
	public String atualizarNaturalidadeCliente(Cliente c, String novoNaturalidade){
		Cliente clien = clienRepo.buscarPorCPF(c.getCpf());
		if(clien != null) {
			clien.setNaturalidade(novoNaturalidade);			
		}
		return clien.getNaturalidade();
	}
	
	public String atualizarEstadoCivilCliente(Cliente c, String novoEstadoCivil){
		Cliente clien = clienRepo.buscarPorCPF(c.getCpf());
		if(clien != null) {
			clien.setEstadoCivil(novoEstadoCivil);			
		}
		return clien.getEstadoCivil();
	}
	
	public String atualizarSexoCliente(Cliente c, String novoSexo){
		Cliente clien = clienRepo.buscarPorCPF(c.getCpf());
		if(clien != null) {
			clien.setSexo(novoSexo);			
		}
		return clien.getSexo();
	}
	
	public String atualizarProfissaoCliente(Cliente c, String novoProfissao){
		Cliente clien = clienRepo.buscarPorCPF(c.getCpf());
		if(clien != null) {
			clien.setProfissao(novoProfissao);			
		}
		return clien.getProfissao();
	}
	
	public String atualizarEnderecoCliente(Cliente c, String novoEndereco){
		Cliente clien = clienRepo.buscarPorCPF(c.getCpf());
		if(clien != null) {
			clien.setEndereco(novoEndereco);			
		}
		return clien.getEndereco();
	}
	
	public String atualizarEmailCliente(Cliente c, String novoEmail){
		Cliente clien = clienRepo.buscarPorCPF(c.getCpf());
		if(clien != null) {
			clien.setEmail(novoEmail);			
		}
		return clien.getEmail();
	}
	
	public String atualizarNacionalidadeCliente(Cliente c, String novoNacionalidade){
		Cliente clien = clienRepo.buscarPorCPF(c.getCpf());
		if(clien != null) {
			clien.setNacionalidade(novoNacionalidade);			
		}
		return clien.getNacionalidade();
	}
	
	
	
	
	
	
}
