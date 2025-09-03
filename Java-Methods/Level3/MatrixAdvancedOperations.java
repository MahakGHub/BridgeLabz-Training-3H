public class MatrixAdvancedOperations {
    public static int[][] transpose(int[][] M) {
        int n = M.length;
        int[][] T = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                T[j][i] = M[i][j];
        return T;
    }

    public static int determinant(int[][] M) {
        int n = M.length;
        if (n == 1) return M[0][0];
        if (n == 2) return (M[0][0]*M[1][1]) - (M[0][1]*M[1][0]);

        int det = 0;
        for (int col = 0; col < n; col++) {
            det += Math.pow(-1, col) * M[0][col] * determinant(minor(M, 0, col));
        }
        return det;
    }

    private static int[][] minor(int[][] M, int row, int col) {
        int n = M.length;
        int[][] minor = new int[n-1][n-1];
        int r = 0, c;
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            c = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                minor[r][c++] = M[i][j];
            }
            r++;
        }
        return minor;
    }

    public static void main(String[] args) {
        int[][] A = { {1,2,3}, {0,1,4}, {5,6,0} };

        System.out.println("Transpose:");
        printMatrix(transpose(A));
        System.out.println("Determinant: " + determinant(A));
    }

    public static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
