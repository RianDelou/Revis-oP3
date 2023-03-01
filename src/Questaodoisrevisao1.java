import java.util.Scanner;

public class Questaodoisrevisao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int contador = 0;
        char decidir;

        do {
            System.out.print("Digite o número: ");
            x = input.nextInt();
            final int divisivelPorTres = x % 3;

             if (divisivelPorTres == 0) {

                 contador++;

             }

            System.out.print("Deseja continuar? (s/n) --> ");
            decidir = input.next().charAt(0);

             if (decidir == 'n') {

                 System.out.print("você digitou "+ contador +" números divisiveis por 3!");

             }


        } while (decidir == 's');
    }
}
