public class Questaoumrevisao2 {
    public static void matrizTransposta(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++ ) {

            for (int j = 0; j < matriz.length; j++) {
                System.out.print("   "+ matriz[j][i] + "\t");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        matriz[0][0] = 6;
        matriz[0][1] = 3;
        matriz[0][2] = 9;

        matriz[1][0] = 1;
        matriz[1][1] = 4;
        matriz[1][2] = 2;

        matriz[2][0] = 8;
        matriz[2][1] = 7;
        matriz[2][2] = 5;

        System.out.print("   matriz transposta   " + "\n");

        matrizTransposta(matriz);


    }

}
