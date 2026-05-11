import java.util.Scanner;

class MatrixProduct {
    static double[][] product(double[][] matA, double[][] matB) {
        if (matA[0].length != matB.length)
            return null;
        int n = matA.length;
        int m = matA[0].length;
        int p = matB[0].length;
        double[][] result = new double[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < m; k++) {
                    result[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
        return result;
    }

    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for the matrix A: ");
        int n = sc.nextInt();

        System.out.print("Enter the number of columns for the matrix A AND rows for the matrix B: ");
        int m = sc.nextInt();

        System.out.print("Enter the number of columns for the matrix B: ");
        int p = sc.nextInt();

        double[][] matA = new double[n][m];
        double[][] matB = new double[m][p];

        System.out.print("\nEnter the matrix A: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Enter matA[%d][%d]: ", i, j);
                matA[i][j] = sc.nextDouble();
            }
        }

        System.out.print("\nEnter the matrix B: \n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.printf("Enter matB[%d][%d]: ", i, j);
                matB[i][j] = sc.nextDouble();
            }
        }

        double[][] result = product(matA, matB);
        System.out.println("The product of the two matrices is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print("[");
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%8.2f", result[i][j]);
            }
        System.out.println("]");
        }
    }
}