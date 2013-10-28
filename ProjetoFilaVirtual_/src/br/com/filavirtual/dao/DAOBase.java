package br.com.filavirtual.dao;

import java.util.List;

public interface DAOBase<T> {

	public void adicionar(T objeto);

	public void remover(T objeto);

	public void alterar(T objeto);

	public List<T> lista();

	public T get(long id);
}
