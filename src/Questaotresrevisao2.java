import java.util.Scanner;

public class Questaotresrevisao2 {

    public static boolean primoverdadeiro(int numeroVerificar) {
        for(int i = 2; i < numeroVerificar; i++) {
                if (numeroVerificar % i == 0) {
                     return false;
                }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numeroVerificar = input.nextInt();

        if (primoverdadeiro(numeroVerificar)) {
            System.out.print("é primo! ");
        } else
            System.out.print("não é primo! ");

    }
}
