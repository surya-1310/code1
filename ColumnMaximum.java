import java.util.Scanner;

public class ColumnMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Maximum in each column:");

        for (int j = 0; j < cols; j++) {
            int max = a[0][j];

            for (int i = 1; i < rows; i++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }

            System.out.println("Column " + (j + 1) + ": " + max);
        }

        sc.close();
    }
}