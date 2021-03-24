package sicred.model;

public class Cliente {
	
	private String nome;
	private long cpf;
	private int rg;
	private String filiacao;
	private String nascimento;
	private String naturalidade;
	private String estadoCivil;
	private String sexo;
	private String profissao;
	private String endereco;
	private String email;
	private String nacionalidade;
	
	public Cliente(String nome, long cpf, int rg, String filiacao, String nascimento, String naturalidade,
			String estadoCivil, String sexo, String profissao, String endereco, String email, String nacionalidade) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.filiacao = filiacao;
		this.nascimento = nascimento;
		this.naturalidade = naturalidade;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
		this.profissao = profissao;
		this.endereco = endereco;
		this.email = email;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getFiliacao() {
		return filiacao;
	}

	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
	
	
}
