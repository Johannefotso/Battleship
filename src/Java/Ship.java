package Java;
public class Ship {
    private int x;
    private int y;
    private int length;
    private String direction;

    public Ship(int x, int y, int length, String direction) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLength() {
        return length;
    }

    public String getDirection() {
        return direction;
    } 
}
