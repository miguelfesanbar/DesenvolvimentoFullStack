package Tarefa1;

import java.time.*;

public class ContaPoupanca extends Conta{

  private double taxaCorrecao;
  private LocalDate dataCriacao;
  
  //construtor abrirConta
  public ContaPoupanca(Pessoa cliente, double taxaCorrecao) {
    super(cliente);
    this.taxaCorrecao = taxaCorrecao;
    dataCriacao = LocalDate.now();
  }

  public double getTaxaCorrecao() {
    return taxaCorrecao;
  }

  public void setTaxaCorrecao(double taxaCorrecao) {
    this.taxaCorrecao = taxaCorrecao;
  }

  public void atualizaRendimento(Conta conta) {
	  LocalDate dataCheck = LocalDate.now();
	  Period period = Period.between(dataCriacao, dataCheck);
	  if(period.getMonths() >= 12) {
		  conta.depositar(conta.getSaldo()*taxaCorrecao);
	  }
  }
}