public class GameOfLife {



    public static void main(String[] args) {

        int[][] matrix = {
                {0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 1, 1}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {

                }
            }
        }

        Grid grid = new Grid(matrix);
    }
}