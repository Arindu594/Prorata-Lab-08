import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        int i = 0;

        // Input 6 positive numbers
        while (i < 6) {

            System.out.print("Enter a positive number: ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please enter a positive number.");
            } else {
                numbers[i] = num;
                i++;
            }
        }

        // Find maximum number
        int max = numbers[0];

        for (i = 1; i < 6; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number = " + max);

        input.close();
    }
}