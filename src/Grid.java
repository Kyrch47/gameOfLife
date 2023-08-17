public class Grid {
    Cell[][] cellMatrix;

    public Grid(int[][] matrix) {
        createGrid(matrix);
        playGame();
    }

//    public static int checkCellNeighbors(int rowIndex, int colIndex) {
//        int neighborCount = 0;
//        for (int i = - 1; i <= 1; i++) {
//            for (int j = - 1; j <= 1; j++) {
//                try {
//                    if (grid[rowIndex + i][colIndex + j] == 1) {
//                        neighborCount++;
//                    }
//                } catch (Exception e) {
//
//                }
//            }
//        }
//        return neighborCount - 1;
//    }

    private void createGrid(int[][] matrix) {
        this.cellMatrix = new Cell[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                this.cellMatrix[i][j] = new Cell(matrix[i][j]);
//                checkCellNeighbors(this.cellMatrix[i][j]);
            }
        }
    }

    public void printGrid() {
        for (int i = 0; i < this.cellMatrix.length; i++) {
            for (int j = 0; j < this.cellMatrix[i].length; j++) {
                System.out.print(this.cellMatrix[i][j].getStatus() + " ");
            }
            System.out.println();
            
        }
    }

    public void playGame() {
        while (true) {
            printGrid();

        }
    }
}
