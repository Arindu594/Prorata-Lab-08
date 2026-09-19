public class ArrayAddition {
    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Add A and B and store in C
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        // Display C
        System.out.println("Array C:");

        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }
    }
}