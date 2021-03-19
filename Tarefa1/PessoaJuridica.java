public class PessoaJuridica extends Pessoa{

  private int cnpj;
  private String atividade;
  
  //construtor
  public PessoaJuridica(int id, String nome, String endereco, int cnpj, String atividade) {
    super(id, nome, endereco);
    this.cnpj = cnpj;
    this.atividade = atividade;
  }

  public int getCnpj() {
    return cnpj;
  }
  
  public void setCnpj(int cnpj) {
    this.cnpj = cnpj;
  }

  public String getAtividade() {
    return atividade;
  }
    
  public void setAtividade(String atividade) {
    this.atividade = atividade;
  } 
}