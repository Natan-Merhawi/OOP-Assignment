package Assignment_4.Question_3;

import java.util.ArrayList;

public class PlanetWaterPark {

    private String parkName;
    private ArrayList<Ride> listOfRides;

    public PlanetWaterPark(String parkName){
        this.listOfRides = new ArrayList<>();
        this.parkName = parkName;
    }

    public String getParkName() {
        return parkName;
    }

    public void addRide(Ride ride){
        this.listOfRides.add(ride);
    }

    public void displayRideDetails(){
        for (Ride ride : listOfRides) {
            System.out.println("The Ride name is" + ride.getRideName());
            System.out.println("The Ride ID is " + ride.getRideID());
        }
    }
    
}
