import java.util.Scanner;

public class Questaoum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        final int par = 0;
        final int impar = 1;

        System.out.print("Escreva um número: ");
        x = input.nextInt();
        final int moduloPorDois = x % 2;

        if(moduloPorDois == par) {

            System.out.print("o número " + x + " é par!");

        } else if (moduloPorDois == impar) {

            System.out.print("o número " + x + " é impar!");

        }
    }
}
