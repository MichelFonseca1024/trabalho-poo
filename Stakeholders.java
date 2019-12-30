import java.util.Scanner;
public abstract class Stakeholders{

  private String nome;
  private String email;
  private String cpf;
  private String datanasc;
  private String telefone;
  private String cidade;
  private String senha;

  
  Scanner input = new Scanner(System.in);

  public String getnome() { 
    return this.nome;
  }
 
  public String getemail() { 
    return this.email;
  }

  public String getcpf() {
    return this.cpf; 

  }

  public String getdatanasc() { 
    return this.datanasc;
  }

  public String gettelefone() { 
    return this.telefone;
  }

  public String getcidade() {
    return this.cidade; 

  }
 
  public void setnome(String nome) { 
    this.nome = nome; 
  }
  
  public void setcpf(String cpf) { 
    this.cpf = cpf; 
  }

  public void setdatanasc(String nasc) { 
    this.datanasc = nasc; 
  }

  public void setemail(String email) { 
    this.email = email; 
  }

  public void settel(String telefone) { 
    this.telefone = telefone; 
  }

  public void setcidade(String city) { 
    this.cidade = city; 
  }


  public void cadastrar(){
    System.out.println("Nome:");
    setnome(input.next());

    System.out.println("CPF:");
    setcpf(input.next());

    System.out.println("DATA DE NASCIMENTO: dd/MM/AAAA");
    
    setdatanasc(input.next());

    System.out.println("E-MAIL:");
    setemail(input.next());

    System.out.println("TELEFONE:");
    settel(input.next());

    System.out.println("CIDADE:");
    setcidade(input.next());
  }
  public void fazerlogin(String email, String senha){
    if(this.email == email && this.senha == senha){
      System.out.println("Logado");
    }
    
    
  }

  

  

}