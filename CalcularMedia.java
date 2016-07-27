import java.util.Scanner;

public class NOTAS {
  
  public static void main(String[]args){
  
  Scanner entrada = new Scanner(System.in);
  
  int nota1;
  int nota2;
  int nota3;
  int media;
  
  System.out.println("Digite sua primeira nota de prova");
  nota1=entrada.nextInt();
  
  System.out.println("Digite sua segunda nota de prova");
  nota2=entrada.nextInt();
  
  System.out.println("Digite sua terceira nota de prova");
  nota3=entrada.nextInt();
  
  media=(nota1+nota2+nota3)/3;
  
  System.out.printf("Sua media e  "+media + "\n");
  }
}
