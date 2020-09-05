package Questao11;

public class Pessoa {

	private String nome;
	private boolean pessoaJutidica;
	private String cpf;

	public Pessoa() {

	}

	public Pessoa(String nome, boolean pessoaJutidica, String cpf) {

		this.nome = nome;
		this.pessoaJutidica = pessoaJutidica;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isPessoaJutidica() {
		return pessoaJutidica;
	}

	public void setPessoaJutidica(boolean pessoaJutidica) {
		this.pessoaJutidica = pessoaJutidica;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
