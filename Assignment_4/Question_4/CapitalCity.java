package Assignment_4.Question_4;

public class CapitalCity extends Country {
    private String cityName;

    public CapitalCity(String countryName, int population, double area, String cityName) {
        super(countryName, population, area);
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void displayDetails() {
        System.out.println("Country Name: " + getCountryName());
        System.out.println("Population: " + getPopulation());
        System.out.println("Area: " + getArea());
        System.out.println("City Name: " + getCityName());
    }
}