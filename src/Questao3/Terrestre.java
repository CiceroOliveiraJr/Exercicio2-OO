package Questao3;

public class Terrestre extends meioDeTransporte {

	private int qtdeRodas;
	private double potencia;

	public Terrestre(int id, short ano, String modelo, double carga_maxima, int qtdeRodas, double potencia) {
		super(id, ano, modelo, carga_maxima);
		this.qtdeRodas = qtdeRodas;
		this.potencia = potencia;
	}

	@Override
	public double consumo() {

		return this.getPotencia() * this.getCarga_maxima() * 100;
	}

	public int getQtdeRodas() {
		return qtdeRodas;
	}

	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

}
