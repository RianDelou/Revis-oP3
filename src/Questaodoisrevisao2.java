import java.util.Arrays;
import java.util.Scanner;

public class Questaodoisrevisao2 {

    public static void vetmenorvalor (int[] vetor) {

        System.out.println(Arrays.toString(vetor));

            if (vetor[0] < vetor[1] && vetor[0] < vetor[2]) {

                System.out.println("o menor valor é: " +vetor[0]);

            } else if (vetor[1] < vetor[0] && vetor[1] < vetor[2]) {

                System.out.println("o menor valor é: "+vetor[1]);

            } else if (vetor[2] < vetor[0] && vetor[2] < vetor[1]) {

                System.out.println("o menor valor é: "+vetor[2]);

            }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[3];

        System.out.print("digite os 3 valores do vetor: ");

        vetor[0] = input.nextInt();
        vetor[1] = input.nextInt();
        vetor[2] = input.nextInt();

        System.out.println("vetor: ");

        vetmenorvalor(vetor);
    }
}
