package Questao7;

import java.util.ArrayList;

public class Item {

	private int codigo;
	private int nome;
	private int descricao;
	private ArrayList<Modelo> modelos;

	public Item() {

	}

	public Item(int codigo, int nome, int descricao, ArrayList<Modelo> modelos) {

		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.modelos = modelos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNome() {
		return nome;
	}

	public void setNome(int nome) {
		this.nome = nome;
	}

	public int getDescricao() {
		return descricao;
	}

	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(ArrayList<Modelo> modelos) {
		this.modelos = modelos;
	}

}
