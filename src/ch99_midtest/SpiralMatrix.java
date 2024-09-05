package ch99_midtest;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        
        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (value <= n * n) {
            // 위쪽 행 채우기 (left -> right)
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // 오른쪽 열 채우기 (top -> bottom)
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // 아래쪽 행 채우기 (right -> left)
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;

            // 왼쪽 열 채우기 (bottom -> top)
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }

        // 배열 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}