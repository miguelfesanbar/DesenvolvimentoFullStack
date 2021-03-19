package Tarefa2;

public class Conta {

	private Pessoa cliente;
	private Integer nrConta;
	protected Double saldo;
	
	
	
	public Conta(Pessoa cliente, Integer nrConta, Double saldo) {
		super();
		this.cliente = cliente;
		this.nrConta = nrConta;
		this.saldo = saldo;
	}
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	public Integer getNrConta() {
		return nrConta;
	}
	public void setNrConta(Integer nrConta) {
		this.nrConta = nrConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	protected Boolean temSaldo(Double valor) {
		return (valor <= this.saldo);
	}
	
	private void debitar(Double valor) {
		this.saldo -= valor;
	}
	private void acrescentar(Double valor) {
		this.saldo += valor;
	}
	
	public void sacar(Double valor) {
		if(this.temSaldo(valor)) {
			this.debitar(valor);
			System.out.println("Saque realizado com sucesso! Novo Saldo: "+this.saldo);
		}else {
			System.out.println("Saldo Insuficiente");
		}
	}
	
	public void depositar(Double valor) {
		this.acrescentar(valor);
		System.out.println("Dep�sito realizado com sucesso!");
		System.out.println("Novo Saldo: "+this.saldo);
	}
	
	public void transferir(Double valor, Conta destino) {
		if(this.temSaldo(valor)) {
			this.debitar(valor);
			destino.acrescentar(valor);
			System.out.println("Transfer�ncia com sucesso! Novo Saldo: "+this.saldo);
		}else {
			System.out.println("Saldo Insuficiente");
		}
	}
	
}













