package Questao11;

import java.util.ArrayList;

public class Partido {

	private String nome;
	private String sigla;
	private ArrayList<Candidato> candidatos;

	public Partido() {

	}

	public Partido(String nome, String sigla, ArrayList<Candidato> candidatos) {

		this.nome = nome;
		this.sigla = sigla;
		this.candidatos = candidatos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

}
