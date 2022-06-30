package ESIIIChainOfResponsability2.src.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "funcionarios")
public class Funcionario {
  @Id
  @Column(name = "id")
  @NotNull
  private int id;

  @Column(name = "nome")
  @NotNull
  private String nome;

  @Column(name = "salario")
  @NotNull
  private float salario;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getSalario() {
    return this.salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Funcionario)) {
      return false;
    }
    Funcionario funcionario = (Funcionario) o;
    return id == funcionario.id && Objects.equals(nome, funcionario.nome) && salario == funcionario.salario;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, salario);
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", nome='" + getNome() + "'" +
        ", salario='" + getSalario() + "'" +
        "}";
  }

}
