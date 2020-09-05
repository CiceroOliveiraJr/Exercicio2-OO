package Questao11;

import java.util.ArrayList;

public class Casa extends ZonaEleitoral {

	private int numeroCasa;

	public Casa() {

	}

	public Casa(String endereco, String cEP, ArrayList<Eleitor> eleitor, int numeroCasa) {
		super(endereco, cEP, eleitor);
		this.numeroCasa = numeroCasa;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

}
