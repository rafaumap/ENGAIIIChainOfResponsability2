package ESIIIChainOfResponsability2.src.controller;

import ESIIIChainOfResponsability2.src.model.Funcionario;

public class CalculaINSSFaixa2 implements ICalculaINSS {

  @Override
  public float calculaINSS(Funcionario f) {
    float salario = f.getSalario();
    float desconto = 0;

    if (salario >= 1212f && salario <= 2427.35f) {
      float diferenca = 2427.35f - 1212f;
      desconto = diferenca * 0.09f;
    }

    return desconto;
  }

  @Override
  public float proximoCalculo(Funcionario f) {
    CalculaINSSFaixa3 faixa3 = new CalculaINSSFaixa3();
    return calculaINSS(f) + faixa3.proximoCalculo(f);
  }

}
