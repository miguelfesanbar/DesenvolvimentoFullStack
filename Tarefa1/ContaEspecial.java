public class ContaEspecial extends Conta{
  private double limite;

  //construtor abrirConta
  public ContaEspecial(Pessoa cliente, double limite) {
    super(cliente);
    this.limite = limite;
  }
  
  public double getLimite() {
    return limite;
  }
    
  public void setLimite(double limite) {
    this.limite = limite;
  }
}