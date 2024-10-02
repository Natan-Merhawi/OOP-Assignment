package Question_5;


public class Sneaker extends Shoes {
    private String typeOfSole;

    public Sneaker(String brand, double price, String typeOfSole) {
        super(brand, price);
        this.typeOfSole = typeOfSole;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The Type of Sole is" + this.typeOfSole);
    }
}