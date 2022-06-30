package ESIIIChainOfResponsability2.src.controller;

import ESIIIChainOfResponsability2.src.model.Funcionario;

public interface ICalculaINSS {
  public float calculaINSS(Funcionario f);

  public float proximoCalculo(Funcionario f);
}
