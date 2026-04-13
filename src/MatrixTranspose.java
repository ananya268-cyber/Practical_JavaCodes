import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns");
        int M = sc.nextInt();

        System.out.println("enter new matrix with dimension" + N + "and" + M);
        int[][] D = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                D[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose of the matrix");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(D[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
