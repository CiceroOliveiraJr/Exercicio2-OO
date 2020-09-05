package Questao3;

public abstract class meioDeTransporte {

	private int id;
	private short ano;
	private String modelo;
	private double carga_maxima;

	public meioDeTransporte() {

	}

	public meioDeTransporte(int id, short ano, String modelo, double carga_maxima) {
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.carga_maxima = carga_maxima;
	}

	/**
	 * Método para executar na classe filho
	 * 
	 * @return Retorna a pontência máxima do motor
	 */
	public abstract double consumo();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCarga_maxima() {
		return carga_maxima;
	}

	public void setCarga_maxima(double carga_maxima) {
		this.carga_maxima = carga_maxima;
	}

}
