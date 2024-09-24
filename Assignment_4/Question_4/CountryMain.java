package Assignment_4.Question_4;

public class CountryMain {

    public static void main(String[] args) {
        System.out.println(">>>>>>> demo of different access modifiers <<<<<<<<");
        Country eri = new Country(" Eritrea", 5000000, 803520);
        System.out.println("Country Name is" +  eri.getCountryName());
        System.out.println("Eritrea's area is " + eri.area); // public access

        CapitalCity Asmara = new CapitalCity("Eritrea", 5000000,803520, "Asmara");
        Asmara.displayDetails();

        // Accessing protected member from subclass
        System.out.println("The Population in Eritrea is " +  Asmara.getPopulation());

        // Accessing private member from within the same class
        Country Uganda = new Country("Uganda", 127817277, 377944);
        System.out.println("UGANDA Country Name: " + Uganda.getCountryName());

        // Accessing package-private (default) member from within the same package
        Country Kenya = new Country("Kenya", 37742154, 9093510);
        System.out.println("Canada Country Name: " + Kenya.getCountryName());
    }
}
