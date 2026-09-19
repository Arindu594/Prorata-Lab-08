import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];

        // Input numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Print in reverse order
        System.out.println("Array in reverse order:");

        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }

        input.close();
    }
}