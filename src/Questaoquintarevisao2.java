import java.util.Scanner;

public class Questaoquintarevisao2 {

    public static double fatorialiterativa(int numeroParaFatorar) {

        double fatorial = 0;

        for(int vezesParaMultiplicar = 1; vezesParaMultiplicar < numeroParaFatorar; vezesParaMultiplicar++) {

            if (fatorial == 0) {

                fatorial = numeroParaFatorar * vezesParaMultiplicar;

            } else {

                fatorial = fatorial * vezesParaMultiplicar;

            }
        }

       return fatorial;

    }

    public static double fatorialrecursiva(int numeroparafatorar) {

        if(numeroparafatorar == 1) {

            return 1;
        } else {

            return fatorialrecursiva(numeroparafatorar - 1) * numeroparafatorar;

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número para ser fatorado: ");
        int numeroParaFatorar = input.nextInt();

        System.out.println("Fatorial iterativa: " + fatorialiterativa(numeroParaFatorar));


        System.out.println("Fatorial recursiva: " + fatorialrecursiva(numeroParaFatorar));
    }
}
