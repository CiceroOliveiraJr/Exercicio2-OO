package Questao9;

import java.sql.Date;

public class Animal {

	private int id;
	private String nome;
	private char tipo;
	private String rga;
	private Date dataNascimento;
	private Raca raca;
	private char genero;
	private String deficiencia;
	private boolean vacinado;
	private boolean castrado;
	private double peso;
	private String temperamento;
	private String observacao;
	private Date dataResgate;

	public Animal() {

	}

	public Animal(int id, String nome, char tipo, String rga, Date dataNascimento, Raca raca, char genero,
			String deficiencia, boolean vacinado, boolean castrado, double peso, String temperamento, String observacao,
			Date dataResgate) {

		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.rga = rga;
		this.dataNascimento = dataNascimento;
		this.raca = raca;
		this.genero = genero;
		this.deficiencia = deficiencia;
		this.vacinado = vacinado;
		this.castrado = castrado;
		this.peso = peso;
		this.temperamento = temperamento;
		this.observacao = observacao;
		this.dataResgate = dataResgate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getRga() {
		return rga;
	}

	public void setRga(String rga) {
		this.rga = rga;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getDeficiencia() {
		return deficiencia;
	}

	public void setDeficiencia(String deficiencia) {
		this.deficiencia = deficiencia;
	}

	public boolean isVacinado() {
		return vacinado;
	}

	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDataResgate() {
		return dataResgate;
	}

	public void setDataResgate(Date dataResgate) {
		this.dataResgate = dataResgate;
	}

}
