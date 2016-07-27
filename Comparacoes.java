import java.util.Scanner;

public class comparacoes {
  
  public static void main(String[]args){
    float num1,num2;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o primeiro numero");
    num1=entrada.nextFloat();
    
    System.out.println("Digite o segundo numero");
    num2=entrada.nextFloat();
    
    System.out.printf("%.2f > %.2f -> %s\n", num1, num2, num1 > num2); /*a > b -> retorna 'true' caso 'a' seja maior que 'b', e 'false' caso seja menor*/
    System.out.printf("%.2f >= %.2f -> %s\n", num1, num2, num1>= num2); /*a >= b -> retorna 'true' caso 'a' seja maior ou igual a 'b', e 'false' caso seja menor*/
    System.out.printf("%.2f < %.2f -> %s\n",num1, num2, num1 < num2); /*a < b -> retorna 'true' caso 'a' seja menor que 'b', e 'false' caso seja maior*/
    System.out.printf("%.2f <= %.2f -> %s\n", num1,num2, num1 <= num2); /*a <= b -> retorna 'true' caso 'a' seja menor ou igual a 'b', e 'false' caso seja maior*/
    System.out.printf("%.2f == %.2f -> %s\n", num1, num2, num1 == num2);/*a == b -> retorna 'true' caso 'a' seja igual a b, e 'false' caso contrario*/
    System.out.printf("%.2f != %.2f -> %s\n", num1, num2, num1 != num2); /*a != b -> retorna 'true' caso 'a' seja diferente de b, e 'false' caso contrario*/
    
  }
}

     
