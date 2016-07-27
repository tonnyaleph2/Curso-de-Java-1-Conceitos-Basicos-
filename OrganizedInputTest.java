import java.util.Scanner;
import java.util.Calendar;

public class Entrada {
  
  public static void main(String[]args){
    
    Scanner entrada = new Scanner(System.in);
    int idade;
    int ano_atual;
    int ano_nascimento;
    
    // pergunta a idade e armazena
    
    System.out.println("Digite sua idade");
    idade= entrada.nextInt();
    
    //Criando um objeto tipo Calendar, o'calendario' e armazenando no ano_atual
    Calendar calendario = Calendar.getInstance();
    ano_atual=calendario.get(Calendar.YEAR);
    ano_nascimento=(ano_atual - idade);
    
    System.out.printf("Seu ano de nascimento e:" + ano_nascimento);
    
    
  }
}

    
 
