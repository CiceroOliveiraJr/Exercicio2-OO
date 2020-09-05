package Questao11;

import java.util.ArrayList;
import java.util.Calendar;

public class Votar {

	private int candidatoD;
	private int eleitorD;
	private Calendar data;
	private String cardoCandidato;
	private ArrayList<Eleitor> eleitores;
	private ArrayList<ServidorDeVotos> servidores;
	private Candidato candidato;

	public Votar() {

	}

	public Votar(int candidatoD, int eleitorD, Calendar data, String cardoCandidato, ArrayList<Eleitor> eleitores,
			ArrayList<ServidorDeVotos> servidores, Candidato candidato) {

		this.candidatoD = candidatoD;
		this.eleitorD = eleitorD;
		this.data = data;
		this.cardoCandidato = cardoCandidato;
		this.eleitores = eleitores;
		this.servidores = servidores;
		this.candidato = candidato;
	}

	public void votar() {

	}

	public void cancelar() {

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

	public String getCardoCandidato() {
		return cardoCandidato;
	}

	public void setCardoCandidato(String cardoCandidato) {
		this.cardoCandidato = cardoCandidato;
	}

	public ArrayList<Eleitor> getEleitores() {
		return eleitores;
	}

	public void setEleitores(ArrayList<Eleitor> eleitores) {
		this.eleitores = eleitores;
	}

	public ArrayList<ServidorDeVotos> getServidores() {
		return servidores;
	}

	public void setServidores(ArrayList<ServidorDeVotos> servidores) {
		this.servidores = servidores;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	

}
