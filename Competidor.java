public class Competidor extends Stakeholders implements Inscricao{

  private String categoria;
  private String tamanhocamisa;
  private String nomeplaca;
  private float peso;


  public Competidor(){}
  
  public void setPeso(float peso) {
    this.peso = peso;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public void setNomeplaca(String nomeplaca) {
    this.nomeplaca = nomeplaca;
  }

  public void setTamanhocamisa(String tamanhocamisa) {
    this.tamanhocamisa = tamanhocamisa;
  }

  public float getPeso() {
    return peso;
  }

  public String getCategoria() {
    return categoria;
  }

  public String getNomeplaca() {
    return nomeplaca;
  }
  
  public String getTamanhocamisa() {
    return tamanhocamisa;
  }




  @Override
  public void inscreveremevento(){
    System.out.println("Categoria:");
    setCategoria(input.next());

    System.out.println("Tamanho da camisa:");
    setTamanhocamisa(input.next());

    System.out.println("Nome da placa");
    setNomeplaca(input.next());

    System.out.println("Peso");
    setPeso(input.nextFloat());



  }

  @Override
  public void editardodos(){
    
  }


  public void efetuarpagamento(String forma){
    Pagamento pagar = new Pagamento();
    
    
  }
  
  
}