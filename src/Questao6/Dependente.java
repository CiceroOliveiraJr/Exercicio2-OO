package Questao6;

public class Dependente {

	private int sequencial;
	private String nomeCompleto;
	private Integer sexo;
	private String dataDeNascimento;
	private boolean participarPlano;
	private Funcionario funcionario;

	public Dependente() {

	}

	public Dependente(int sequencial, String nomeCompleto, Integer sexo, String dataDeNascimento,
			boolean participarPlano, Funcionario funcionario) {

		this.sequencial = sequencial;
		this.nomeCompleto = nomeCompleto;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
		this.participarPlano = participarPlano;
		this.funcionario = funcionario;
	}

	public int getSequencial() {
		return sequencial;
	}

	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public boolean isParticiparPlano() {
		return participarPlano;
	}

	public void setParticiparPlano(boolean participarPlano) {
		this.participarPlano = participarPlano;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
