package Java;
public class Grid {
    private Location[][] grid;

    public Grid(int rows, int cols) {
        grid = new Location[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = new Location(false, "-");
            }
        }
    }

    public Grid () {

    }

    public Location getLocation(int row, int col) {
        return grid[row][col];
    }

    public void setLocation(int row, int col, Location location) {
        grid[row][col] = location;
    } 
}
