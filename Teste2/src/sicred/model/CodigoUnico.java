package sicred.model;

public class CodigoUnico {

	private String codigoUnico;
	private Cliente cliente;
	private Convenente convenente;
	
	public CodigoUnico(String codigoUnico, Cliente cliente, Convenente convenente) {
		this.codigoUnico = codigoUnico;
		this.cliente = cliente;
		this.convenente = convenente;
	}

	public String getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(String codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Convenente getConvenente() {
		return convenente;
	}

	public void setConvenente(Convenente convenente) {
		this.convenente = convenente;
	}
	
	
	
}
