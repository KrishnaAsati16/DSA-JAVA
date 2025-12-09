import java.util.Scanner;

public class Search2dMatrix {

    // Method to search the target in the 2D matrix
    public boolean searchMatrix(int[][] matrix, int target) {

        // Get total rows and columns
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from the top-right corner
        int row = 0;
        int col = cols - 1;

        // Loop until we go out of bounds
        while (row < rows && col >= 0) {

            int currentValue = matrix[row][col];

            // Print the current position and value (for understanding)
            System.out.println("Checking value at (" + row + ", " + col + ") = " + currentValue);

            // Case 1: Target found
            if (currentValue == target) {
                System.out.println("Target " + target + " found at position (" + row + ", " + col + ")");
                return true;
            }

            // Case 2: Current value > target → move left
            else if (currentValue > target) {
                System.out.println("Current value > target, moving LEFT");
                col--;
            }

            // Case 3: Current value < target → move down
            else {
                System.out.println("Current value < target, moving DOWN");
                row++;
            }
        }

        // If loop ends → value not found
        System.out.println("Target " + target + " not found in this matrix.");
        return false;
    }


    // Helper method to display matrix
    public void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }


    // MAIN method
    public static void main(String[] args) {

        Search2dMatrix obj = new Search2dMatrix();

        // Create a scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Get matrix dimensions
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        // Create matrix
        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements (sorted row-wise and column-wise):");

        // Input elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        obj.printMatrix(matrix);

        // Enter target
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        // Call search function
        boolean found = obj.searchMatrix(matrix, target);

        // Output result in clear format
        if (found) {
            System.out.println("\nRESULT: Target FOUND in the matrix.");
        } else {
            System.out.println("\nRESULT: Target NOT FOUND in the matrix.");
        }

        sc.close();
    }
}

// LEET CODE 240
