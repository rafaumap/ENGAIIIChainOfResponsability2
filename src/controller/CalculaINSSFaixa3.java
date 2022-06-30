package ESIIIChainOfResponsability2.src.controller;

import ESIIIChainOfResponsability2.src.model.Funcionario;

public class CalculaINSSFaixa3 implements ICalculaINSS {
  @Override
  public float calculaINSS(Funcionario f) {
    float salario = f.getSalario();
    float desconto = 0;

    if (salario >= 2427.36f && salario <= 3641.03f) {
      float diferenca = 3641.03f - 2427.35f;
      desconto = diferenca * 0.12f;
    }

    return desconto;
  }

  @Override
  public float proximoCalculo(Funcionario f) {
    CalculaINSSFaixa4 faixa4 = new CalculaINSSFaixa4();
    return calculaINSS(f) + faixa4.proximoCalculo(f);
  }
}
