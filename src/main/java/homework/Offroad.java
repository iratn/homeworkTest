package homework;

public class Offroad extends Vehicle{
    private int groundClearance; // дорожный просвет в дюймах //

    Offroad(int р, int f, int m) {
        super(р, f, m);
    }

    public void setGroundClearance(int groundClearance) {
        this.groundClearance = groundClearance;
    }

    public int getGroundClearance() {
        return groundClearance;
    }
}