public class MatrixOperations {
    public static void main(String[] args) {
        int[][] A = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][] B = { {9,8,7}, {6,5,4}, {3,2,1} };
        int[][] sum = new int[3][3];
        int[][] diff = new int[3][3];
        int[][] prod = new int[3][3];

        // Sum & Difference
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = A[i][j] + B[i][j];
                diff[i][j] = A[i][j] - B[i][j];
            }
        }

        // Multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                prod[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    prod[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrix Sum:");
        printMatrix(sum);
        System.out.println("Matrix Difference:");
        printMatrix(diff);
        System.out.println("Matrix Product:");
        printMatrix(prod);
    }

    public static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
