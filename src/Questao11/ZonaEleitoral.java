package Questao11;

import java.util.ArrayList;

public class ZonaEleitoral {

	private String endereco;
	private String CEP;
	private ArrayList<Eleitor> eleitor;

	public ZonaEleitoral() {

	}

	public ZonaEleitoral(String endereco, String cEP, ArrayList<Eleitor> eleitor) {

		this.endereco = endereco;
		CEP = cEP;
		this.eleitor = eleitor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public ArrayList<Eleitor> getEleitor() {
		return eleitor;
	}

	public void setEleitor(ArrayList<Eleitor> eleitor) {
		this.eleitor = eleitor;
	}

}
