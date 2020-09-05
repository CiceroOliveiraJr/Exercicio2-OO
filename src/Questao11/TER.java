package Questao11;

import java.util.ArrayList;

public class TER extends ZonaEleitoral {

	private int numeroZona;

	public TER() {

	}

	public TER(String endereco, String cEP, ArrayList<Eleitor> eleitor, int numeroZona) {
		super(endereco, cEP, eleitor);
		this.numeroZona = numeroZona;
	}

	public int getNumeroZona() {
		return numeroZona;
	}

	public void setNumeroZona(int numeroZona) {
		this.numeroZona = numeroZona;
	}

}
