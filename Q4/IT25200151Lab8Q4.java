import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        // Insert 8 valid Student IDs
        int i = 0;

        while (i < 8) {

            System.out.print("Enter Student ID: ");
            int id = input.nextInt();

            if (id <= 0) {
                System.out.println("Error: Student ID must be a positive number.");
            } else {
                studentsArray[i] = id;
                i++;
            }
        }

        // Enter Student ID to search
        System.out.print("Enter Student ID to search: ");
        int searchID = input.nextInt();

        // Search the array
        boolean found = false;

        for (i = 0; i < 8; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}