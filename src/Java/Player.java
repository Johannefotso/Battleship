package Java;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Ship> ships;
    private Grid grid;

    public Player(String name, int cols, int rows) {
        this.name =  name;
        ships = new ArrayList<Ship>();
        grid = new Grid(rows, cols);
    }

    public String getName() {
        return name;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public Grid getGrid() {
        return grid;
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void placeShips()
    {
        // logic for placing ships on the grid
    }

    public void makeGuess(int row, int col, Player opponent)
    {
        Location location = opponent.getGrid().getLocation(row, col);
        if (location.hasShip())
        {
            location.setStatus("X");
            // logic for handling a hit
        } else
        {
            location.setStatus("O");
            // logic for handling a miss
        }
    } 
}
