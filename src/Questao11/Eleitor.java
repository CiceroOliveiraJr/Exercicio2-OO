package Questao11;

public class Eleitor extends Pessoa {

	private String endereco;
	private int eleitor;
	private Votar votar;

	public Eleitor() {

	}

	public Eleitor(String endereco, int eleitor) {

		this.endereco = endereco;
		this.eleitor = eleitor;
		this.votar = votar;
	}

	public int validar() {

		return this.setEleitor(0);

	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getEleitor() {
		return eleitor;
	}

	public int setEleitor(int eleitor) {
		return this.eleitor = eleitor;
	}

	public Votar getVotar() {
		return votar;
	}

	public void setVotar(Votar votar) {
		this.votar = votar;
	}
	

}
