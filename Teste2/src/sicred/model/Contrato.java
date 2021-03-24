package sicred.model;

public class Contrato {
	
	private Cliente cliente;
	private Convenente convenente;
	private String instrucaoFinanceira;
	private String tipo;
	private double valorBruto;
	private double valorLiquido;	
	private double taxaMensal;
	private String dataConcessao;
	private String vencimentoPrimeiraParcela;
	private String vencimentoUltimaParcela;
	private int prazo;
	private double valorParcela;
	
	public Contrato(Cliente cliente, Convenente convenente, String instrucaoFinanceira, String tipo, double valorBruto,
			double valorLiquido, double taxaMensal, String dataConcessao, String vencimentoPrimeiraParcela,
			String vencimentoUltimaParcela, int prazo, double valorParcela) {
		this.cliente = cliente;
		this.convenente = convenente;
		this.instrucaoFinanceira = instrucaoFinanceira;
		this.tipo = tipo;
		this.valorBruto = valorBruto;
		this.valorLiquido = valorLiquido;
		this.taxaMensal = taxaMensal;
		this.dataConcessao = dataConcessao;
		this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
		this.vencimentoUltimaParcela = vencimentoUltimaParcela;
		this.prazo = prazo;
		this.valorParcela = valorParcela;
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

	public String getInstrucaoFinanceira() {
		return instrucaoFinanceira;
	}

	public void setInstrucaoFinanceira(String instrucaoFinanceira) {
		this.instrucaoFinanceira = instrucaoFinanceira;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public double getTaxaMensal() {
		return taxaMensal;
	}

	public void setTaxaMensal(double taxaMensal) {
		this.taxaMensal = taxaMensal;
	}

	public String getDataConcessao() {
		return dataConcessao;
	}

	public void setDataConcessao(String dataConcessao) {
		this.dataConcessao = dataConcessao;
	}

	public String getVencimentoPrimeiraParcela() {
		return vencimentoPrimeiraParcela;
	}

	public void setVencimentoPrimeiraParcela(String vencimentoPrimeiraParcela) {
		this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
	}

	public String getVencimentoUltimaParcela() {
		return vencimentoUltimaParcela;
	}

	public void setVencimentoUltimaParcela(String vencimentoUltimaParcela) {
		this.vencimentoUltimaParcela = vencimentoUltimaParcela;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}
	
	
	
	
	
}
