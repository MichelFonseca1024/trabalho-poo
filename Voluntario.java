public class Voluntario extends Stakeholders implements Inscricao{

  private String area;

 
  public void setArea(String area) {
    this.area = area;
  }
  
  public String getArea() {
    return area;
  }

  

  @Override
  public void inscreveremevento(){
    System.out.println("DIGITE A AREA: ");
    setArea(input.next());

    

  }

  @Override
  public void editardodos(){
    
    
  }
  
}