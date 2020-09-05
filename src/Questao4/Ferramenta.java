package Questao4;

public class Ferramenta extends ItemDeLoja {

	private String categoria;
	private Integer serial;

	public Ferramenta(int codigoDoItem, String nomeDoItem, String descricaoDoItem, Double valorDoItem, String categoria,
			Integer serial) {
		super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
		this.categoria = categoria;
		this.serial = serial;
	}

	/**
	 * Retorna o serial da ferramenta
	 */
	public int getIdentificador() {

		return this.getSerial();

	}

	public void separar() {

		if (this.getCategoria().contentEquals(categoria)) {

			this.getCategoria();

		} else {

			separar();
		}

	}

	public void separar(String valor) {

		this.setCategoria("Outros");

	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getSerial() {
		return serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}

}
