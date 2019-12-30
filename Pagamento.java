public class Pagamento{
  private String numerocartao;
  private String bandeiracartao;
  private int cvv;
  private String senha;

  
  public void setNumerocartao(String numerocartao) {
    this.numerocartao = numerocartao;
  }
 
  public void setBandeiracartao(String bandeiracartao) {
    this.bandeiracartao = bandeiracartao;
  }
  
  public void setCvv(int cvv) {
    this.cvv = cvv;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
  
  public String getBandeiracartao() {
    return bandeiracartao;
  }
  
  public int getCvv() {
    return cvv;
  }
  
  public String getNumerocartao() {
    return numerocartao;
  }
  
  public String getSenha() {
    return senha;
  }
  
  public void pagar(){
    
  }


}