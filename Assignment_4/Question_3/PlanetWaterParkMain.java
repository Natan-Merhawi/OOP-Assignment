package Assignment_4.Question_3;

public class PlanetWaterParkMain {
  
    public static void main(String[] args) {
        PlanetWaterPark kampalaPark = new PlanetWaterPark("Kampala Planet Water Park"); 
        Ride slide1 = new Ride("Water Slide", 001);
        Ride wavePool = new Ride(" Pool", 002);

        kampalaPark.addRide(slide1);
        kampalaPark.addRide(wavePool);

        kampalaPark.displayRideDetails();

        
        Ride FreeRide = new Ride("Waves", 003);
        System.out.println("Extra Ride on the  " + FreeRide.getRideName());
    }

}
