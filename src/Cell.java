public class Cell {
    private int status; // 0 for dead, 1 for alive
    private int liveNeighbors;

    public Cell(int status) {
        this.status = status;
    }

    public void setLiveNeighbors(int liveNeighbors) {
        this.liveNeighbors = liveNeighbors;
    }

    public static int checkNeighbours(int[][] grid, int rowIndex, int colIndex) {
        int neighborCount = 0;
        for (int i = - 1; i <= 1; i++) {
            for (int j = - 1; j <= 1; j++) {
                try {
                    if (grid[rowIndex + i][colIndex + j] == 1) {
                        neighborCount++;
                    }
                } catch (Exception e) {

                }
            }
        }
        return neighborCount - 1;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getLiveNeighbors() {
        return liveNeighbors;
    }
}
