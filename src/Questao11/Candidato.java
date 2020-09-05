package Questao11;

public class Candidato extends Pessoa {

	private int candidatoD;
	private String cargo;
	private Partido partido;
	private boolean resultado;
	private String uf;

	public Candidato() {

	}

	public Candidato(int candidatoD, String cargo, Partido partido, boolean resultado, String uf) {

		this.candidatoD = candidatoD;
		this.cargo = cargo;
		this.partido = partido;
		this.resultado = resultado;
		this.uf = uf;
	}

	public int candidatura() {
		return candidatoD;

	}

	public int getCandidatoD() {
		return candidatoD;
	}

	public void setCandidatoD(int candidatoD) {
		this.candidatoD = candidatoD;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
