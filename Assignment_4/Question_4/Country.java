package Assignment_4.Question_4;

public class Country {

    private String countryName;
    protected int population;
    public double area;

    public Country(String countryName, int population, double area) {
        this.countryName = countryName;
        this.population = population;
        this.area = area;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }
    
}
