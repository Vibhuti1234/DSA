 package matrix;

public class CalculateDifference {

    public static int[][] calculateDiff(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] diff = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int onesInRow = 0;
                int onesInCol = 0;
                int zerosInRow = 0;
                int zerosInCol = 0;

                // Count ones and zeros in the row
                for (int k = 0; k < cols; k++) {
                    if (matrix[i][k] == 1) {
                        onesInRow++;
                    } else {
                        zerosInRow++;
                    }
                }

                // Count ones and zeros in the column
                for (int k = 0; k < rows; k++) {
                    if (matrix[k][j] == 1) {
                        onesInCol++;
                    } else {
                        zerosInCol++;
                    }
                }

                // Calculate the diff value
                diff[i][j] = onesInRow + onesInCol - zerosInRow - zerosInCol;
            }
        }

        return diff;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1},
                {1, 0, 1},
                {0, 0, 1}
        };

        int[][] result = calculateDiff(matrix);

        // Print the result matrix
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
