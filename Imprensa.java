public class Imprensa extends Stakeholders implements Inscricao{

  private String nomeEmissora;
  private int quantidadedepessoas;

  public void setNomeEmissora(String nomeEmissora) {
    this.nomeEmissora = nomeEmissora;
  }
  
  public void setQuantidadedepessoas(int quantidadedepessoas) {
    this.quantidadedepessoas = quantidadedepessoas;
  }

  public String getNomeEmissora(){
    return this.nomeEmissora;
  }

  public int getQuantidadedepessoas(){
    return this.quantidadedepessoas;
  }

  

  @Override
  public void inscreveremevento(){
    System.out.println("NOME DA EMISSIRA");
    setNomeEmissora(input.next());

    System.out.println("QUANTIDADE DE PESSOAS");
    setQuantidadedepessoas(input.nextInt());

  }

  @Override
  public void editardodos(){
    
    
  }
  
}