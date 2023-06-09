package arrayexception;

import java.util.Scanner;

public class Array {

    private int[] numbers = new int[5];

    public void createArray() {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        validateArray();

    }

    public void validateArray() {

        Scanner read = new Scanner(System.in);
         int pos = 0;
        try {
            System.out.print("Ingresa la posición que quieres mostrar: ");
            pos = read.nextInt();
            System.out.println(numbers[pos]);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        

    }

}
