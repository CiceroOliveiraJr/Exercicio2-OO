package Questao11;

import java.util.Calendar;

public class ServidorDeVotos {

	private int candidatoD;
	private int eleitorD;
	private Calendar data;
	private int contaVotos;
	private Votar votar;

	public ServidorDeVotos() {

	}

	public ServidorDeVotos(int candidatoD, int eleitorD, Calendar data, int contaVotos, Votar votar) {

		this.candidatoD = candidatoD;
		this.eleitorD = eleitorD;
		this.data = data;
		this.contaVotos = contaVotos;
		this.votar = votar;
	}

	public int contaVotos() {
		return candidatoD;

	}

	public int getCandidatoD() {
		return candidatoD;
	}

	public void setCandidatoD(int candidatoD) {
		this.candidatoD = candidatoD;
	}

	public int getEleitorD() {
		return eleitorD;
	}

	public void setEleitorD(int eleitorD) {
		this.eleitorD = eleitorD;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public int getContaVotos() {
		return contaVotos;
	}

	public void setContaVotos(int contaVotos) {
		this.contaVotos = contaVotos;
	}

	public Votar getVotar() {
		return votar;
	}

	public void setVotar(Votar votar) {
		this.votar = votar;
	}

}
