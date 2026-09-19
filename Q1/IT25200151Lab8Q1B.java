import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        // Input numbers to myArray
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Find even numbers and store in evenArray
        int j = 0;

        for (int i = 0; i < 5; i++) {

            if (myArray[i] % 2 == 0) {
                evenArray[j] = myArray[i];
                j++;
            }
        }

        // Print evenArray
        System.out.println("Even numbers:");

        for (int i = 0; i < j; i++) {
            System.out.print(evenArray[i] + " ");
        }

        input.close();
    }
}