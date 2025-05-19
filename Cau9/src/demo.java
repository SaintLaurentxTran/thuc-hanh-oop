import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Nhập ma trận vuông (n x n)
        System.out.print("Nhập kích thước ma trận (n): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // b. Xuất ma trận
        System.out.println("\nMa trận vừa nhập:");
        printMatrix(matrix);

        // c. Tìm phần tử lớn nhất
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        System.out.println("\nPhần tử lớn nhất trong ma trận: " + max);

        // d. Tính tổng phần tử đường chéo chính
        int sumDiagonal = 0;
        for (int i = 0; i < n; i++) {
            sumDiagonal += matrix[i][i];
        }
        System.out.println("Tổng phần tử trên đường chéo chính: " + sumDiagonal);

        // e. Sắp xếp phần tử ma trận tăng dần theo hàng (zigzag)
        sortMatrixZigzag(matrix);

        System.out.println("\nMa trận sau khi sắp xếp zigzag:");
        printMatrix(matrix);
    }

    // In ma trận
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // Sắp xếp zigzag
    public static void sortMatrixZigzag(int[][] matrix) {
        int n = matrix.length;
        int[] temp = new int[n * n];
        int k = 0;

        // Chuyển toàn bộ phần tử vào mảng 1 chiều
        for (int[] row : matrix) {
            for (int value : row) {
                temp[k++] = value;
            }
        }

        // Sắp xếp tăng dần
        java.util.Arrays.sort(temp);

        // Gán lại vào ma trận theo zigzag
        k = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = temp[k++];
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[i][j] = temp[k++];
                }
            }
        }
    }
}