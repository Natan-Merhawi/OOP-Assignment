package Assignment_4.Question_3;

public class Ride {
    
    private String rideName;
    private int rideID;

    public Ride(String rideName, int rideID){
        this.rideName = rideName;
        this.rideID = rideID;
    }

    public int getRideID() {
        return rideID;
    }

    public String getRideName() {
        return rideName;
    }
}
