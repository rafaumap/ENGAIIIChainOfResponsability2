package ESIIIChainOfResponsability2.src.view;

import ESIIIChainOfResponsability2.src.controller.CalculaINSSFaixa1;
import ESIIIChainOfResponsability2.src.model.Funcionario;
import ESIIIChainOfResponsability2.src.persistence.FuncionarioDao;
import ESIIIChainOfResponsability2.src.util.HibernateUtil;

public class Principal {
  public static void main(String[] args) {
    Funcionario f = new Funcionario();
    f.setId(1);
    f.setNome("Amanda");
    f.setSalario(3000f);

    FuncionarioDao fd = new FuncionarioDao(HibernateUtil.getSessionFactory());
    // fd.insere(f);

    CalculaINSSFaixa1 cif1 = new CalculaINSSFaixa1();
    float desconto = cif1.proximoCalculo(f);

    System.out.println(desconto);
  }
}
