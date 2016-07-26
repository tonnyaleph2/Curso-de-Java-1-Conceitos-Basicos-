import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float preco;
     
        System.out.println("Quanto custa algo em uma loja de R$ 1,99? ");
        preco = entrada.nextFloat();
     
        System.out.println("Ha? " + preco + "?");
     
    }
}