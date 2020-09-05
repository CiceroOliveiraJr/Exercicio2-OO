package Questao11;

public class Resultado {

	private int candidatoD;
	private ArrayList<ServidorVotos> servidores;

	public Resultado() {
		super();
	}

	public Resultado(int candidatoD, ArrayList<ServidorVotos> servidores) {
		super();
		this.candidatoD = candidatoD;
		this.servidores = servidores;
	}

	public int getTotalVotos() {

	}

	public void divulgarVencedor() {

	}

	public int getCandidatoD() {
		return candidatoD;
	}

	public void setCandidatoD(int candidatoD) {
		this.candidatoD = candidatoD;
	}

	public ArrayList<ServidorVotos> getServidores() {
		return servidores;
	}

	public void setServidores(ArrayList<ServidorVotos> servidores) {
		this.servidores = servidores;
	}

}
