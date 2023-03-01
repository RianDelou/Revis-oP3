
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
        limitedosnumeros(2, 20);
    }
}
