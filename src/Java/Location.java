package Java;
public class Location {
    private boolean hasShip;
    private String status;

    public Location(boolean hasShip, String status) {
        this.hasShip = hasShip;
        this.status = status;
    }

    public Location () {

    }

    public boolean hasShip() {
        return hasShip;
    }

    public void setHasShip(boolean hasShip) {
        this.hasShip = hasShip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    } 
}
