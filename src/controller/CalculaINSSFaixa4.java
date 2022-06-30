package ESIIIChainOfResponsability2.src.controller;

import ESIIIChainOfResponsability2.src.model.Funcionario;

public class CalculaINSSFaixa4 implements ICalculaINSS {
  @Override
  public float calculaINSS(Funcionario f) {
    float salario = f.getSalario();
    float desconto = 0;

    if (salario > 3641.03f && salario <= 7087.22f) {
      float diferenca = 7087.22f - 3641.03f;
      desconto = diferenca * 0.14f;
    }

    return desconto;
  }

  @Override
  public float proximoCalculo(Funcionario f) {
    return calculaINSS(f);
  }
}
