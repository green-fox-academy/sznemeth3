public class Matrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        int matrixArray [][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==j) {
                    matrixArray [i][j] = 1;
                    System.out.print(matrixArray[i][j]);
                }
                 else {
                    matrixArray [i][j] = 0;
                    System.out.print(matrixArray[i][j]);
                }
            }
            System.out.println("");
        }

    }
}
