package ESIIIChainOfResponsability2.src.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import ESIIIChainOfResponsability2.src.model.Funcionario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class FuncionarioDao implements IDao<Funcionario> {
  private SessionFactory sf;

  public FuncionarioDao(SessionFactory sf) {
    this.sf = sf;
  }

  @Override
  public void insere(Funcionario funcionario) {
    EntityManager entityManager = sf.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    transaction.begin();
    entityManager.persist(funcionario);
    transaction.commit();
  }

  @Override
  public void modifica(Funcionario funcionario) {
    EntityManager entityManager = sf.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    transaction.begin();
    entityManager.merge(funcionario);
    transaction.commit();
  }

  @Override
  public void remove(Funcionario funcionario) {
    EntityManager entityManager = sf.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    transaction.begin();
    entityManager.remove(funcionario);
    transaction.commit();
  }

  @Override
  public Funcionario busca(Funcionario funcionario) {
    EntityManager entityManager = sf.createEntityManager();
    funcionario = entityManager.find(Funcionario.class, funcionario.getId());
    return funcionario;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Funcionario> lista() {
    List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    StringBuffer buffer = new StringBuffer();

    buffer.append("SELECT f.* ");
    buffer.append("FROM funcionarios f ");
    buffer.append("ORDER BY f.id");
    EntityManager entityManager = sf.createEntityManager();
    Query query = entityManager.createNativeQuery(buffer.toString());
    List<Object[]> lista = query.getResultList();

    for (Object[] obj : lista) {
      Funcionario f = new Funcionario();
      f.setId(Integer.parseInt(obj[0].toString()));
      f.setNome(obj[1].toString());
      f.setSalario(Float.parseFloat(obj[2].toString()));

      funcionarios.add(f);
    }

    return funcionarios;
  }

}
