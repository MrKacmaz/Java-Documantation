package matrix;

public class twoD_matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = j*i;
            }
        }

        for (int[] ints : matrix) {

            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


        // System.arraycopy methodu kullanımı

        /*int[][] matrix2 = new int[twoD_matrix.twoD_matrix.length][twoD_matrix.twoD_matrix[0].length];
        System.arraycopy(twoD_matrix.twoD_matrix, 0, matrix2, 0, twoD_matrix.twoD_matrix.length);

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
