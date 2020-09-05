package Questao12;

public class RelogioPulso extends RelogioImpl {

	private int tipoPulseira;

	public RelogioPulso() {

	}

	public RelogioPulso(int tipoPulseira) {

		this.tipoPulseira = tipoPulseira;
	}

	public RelogioPulso(String marca, String tipo, int tipoPulseira) {
		super(marca, tipo);
		this.tipoPulseira = tipoPulseira;
	}

	public int getTipoPulseira() {
		return tipoPulseira;
	}

	public void setTipoPulseira(int tipoPulseira) {
		this.tipoPulseira = tipoPulseira;
	}

}
