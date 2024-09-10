//package com.vehicle;

public class Car {
    private double speedKph;  // Speed in kilometers per hour
    private float fuelLevel;  // Fuel level as a percentage
    private int distanceTraveled;  // Distance traveled in meters

    // Method to set the speed of the car
    public void setSpeed(double speed) {
        this.speedKph = speed;
    }

    // Method to set the fuel level of the car
    public void setFuelLevel(float fuel) {
        this.fuelLevel = fuel;
    }

    // Method to simulate driving the car for a given distance
    public void drive(int distance) {
        this.distanceTraveled += distance;
    }

    // Method to get the speed in miles per hour
    public double getSpeedMph() {
        return speedKph / 1.60934;
    }

    // Method to get the distance traveled in kilometers
    public int getDistanceKm() {
        return distanceTraveled / 1000;
    }

    // Method to calculate the remaining fuel percentage after driving a given distance
    public int calculateRemainingFuel(double distance) {
        double kilometersDriven = distance / 1000.0;
        double fuelConsumed = kilometersDriven * 0.5;
        return (int) Math.max(0, fuelLevel - fuelConsumed);
    }
}

