package ESIIIChainOfResponsability2.src.persistence;

import java.util.List;

public interface IDao<T> {
  public void insere(T t);

  public void modifica(T t);

  public void remove(T t);

  public T busca(T t);

  public List<T> lista();
}
