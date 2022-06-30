package ESIIIChainOfResponsability2.src.controller;

import ESIIIChainOfResponsability2.src.model.Funcionario;

public class CalculaINSSFaixa1 implements ICalculaINSS {

  @Override
  public float calculaINSS(Funcionario f) {
    float salario = f.getSalario();
    float desconto = 0;

    if (salario < 1212f || salario >= 1212f) {
      desconto = 1212f * 0.075f;
    }

    return desconto;
  }

  @Override
  public float proximoCalculo(Funcionario f) {
    CalculaINSSFaixa2 faixa2 = new CalculaINSSFaixa2();
    return calculaINSS(f) + faixa2.proximoCalculo(f);
  }

}
