package matrix;

public class threeD_matrix {
    public static void main(String[] args) {
        int[][][] threeD = new int[5][5][5];

        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {

                    threeD[i][j][k] = i * j * k;

                }
            }
        }

        for (int[][] ints : threeD) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
