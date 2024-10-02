package Question_5;

public class Shoes {
    private String brand;
    private double price;

    public Shoes(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("The BRAND is" + this.brand);
        System.out.println("and its price is " + this.price);

        
    }
}