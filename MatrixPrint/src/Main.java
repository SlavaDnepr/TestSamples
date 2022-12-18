import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int n = 7;
        final int m = 5;
        int[][] matrix = new int[n][m];
        
        FillMatrix(matrix);
        System.out.println("Matrix without transpose:");
        PrintMatrix(matrix);
        int[][] transponsedMatrix = TransponseMatrix(matrix);
        System.out.println("Matrix after transpose:");
        PrintMatrix(transponsedMatrix);
    }

    private static void PrintMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void FillMatrix(int[][] matrix) {
        Random rand = new Random();
        for(int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                matrix[i][j] = rand.nextInt(10);
    }

    private static int[][] TransponseMatrix(int[][] matrix) {
        int[][] transponsedMatrix = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++){
                transponsedMatrix[j][i] = matrix[i][j];
            }

        return transponsedMatrix;
    }
}