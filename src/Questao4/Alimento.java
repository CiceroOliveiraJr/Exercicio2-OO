package Questao4;

public class Alimento extends ItemDeLoja {

	private Integer selo;

	public Alimento(int codigoDoItem, String nomeDoItem, String descricaoDoItem, Double valorDoItem, Integer selo) {
		super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
		this.selo = selo;
	}

	/**
	 * Retorna o identificador do alimento
	 * 
	 * @return Identificador
	 */
	public int getIdentificador() {

		return this.getIdentificador();

	}

	public Integer getSelo() {
		return selo;
	}

	public void setSelo(Integer selo) {
		this.selo = selo;
	}

}
