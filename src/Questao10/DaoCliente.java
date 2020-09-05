package Questao10;

import java.lang.reflect.Array;

public interface DaoCliente {

	public Cliente incluir(Cliente cliente);

	public void excluir(Integer codigo);

	public Cliente alterar(Cliente cliente);

	public Array lista();

	public Cliente get();

}
