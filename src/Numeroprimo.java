import java.util.Scanner;

public class Numeroprimo {

    public static boolean primoverdadeiro(int numeroVerificar) {
        for(int i = 2; i < numeroVerificar; i++) {
                if (numeroVerificar % i == 0) {
                     return false;
                }
        }
        return true;
    }
    public static void main(String[] args) {
        //digitar o número para verificar aqui
        if (primoverdadeiro(733)) {
            System.out.print("é primo! ");
        } else
            System.out.print("não é primo! ");

    }
}
