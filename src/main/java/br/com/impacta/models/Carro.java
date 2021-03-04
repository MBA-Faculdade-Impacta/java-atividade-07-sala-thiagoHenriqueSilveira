package br.com.impacta.models;

public class Carro
{
  String cor;
  int ano;
  double valor;

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String getCor() {
    return this.cor;
  }

  public int getAno() {
    return this.ano;
  }

  public double getValor() {
    return this.valor;
  }
}