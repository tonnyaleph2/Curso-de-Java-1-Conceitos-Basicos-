import java.util.Scanner;

public class IMC {
  public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
    
    float peso;
    float altura;
    float imc;
    
    System.out.println("Digite seu peso:");
    peso=entrada.nextInt();
    
    System.out.println("Digite sua altura:");
    altura=entrada.nextInt();
    
    imc=peso/altura;
    
    System.out.printf("Seu indice de massa corporal e  " + imc + "\n");
    
  }
}

    
    
