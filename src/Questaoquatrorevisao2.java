import java.util.Scanner;

public class Questaoquatrorevisao2 { //não consegui terminar, fiquei com dúvida
    public static void limitedosnumeros(int limiteInferior, int limiteSuperior) {

        for(int i = limiteInferior; i < limiteSuperior; i++) {

            limiteSuperior--;

            if (limiteSuperior % i != 0) {
                System.out.print(limiteSuperior);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o limite inferior: ");
        int limiteInferior = input.nextInt();

        System.out.println("Digite o limite superior: ");
        int limiteSuperior = input.nextInt();

        limitedosnumeros(limiteInferior, limiteSuperior);
    }
}
