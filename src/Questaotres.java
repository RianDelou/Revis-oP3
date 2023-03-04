import java.util.Arrays;
import java.util.Scanner;

public class Questaotres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[3];

        System.out.print("Digite os três valores para serem ordenados: ");

        array[0] = input.nextInt();
        array[1] = input.nextInt();
        array[2] = input.nextInt();

       for (int i = 0; i < array.length; i++) {
           for (int j = i + 1; j < array.length; j++) {

               if (array[i] > array[j]) {

                   int temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;

               }
           }
       }

        System.out.print(Arrays.toString(array));





    }
}
