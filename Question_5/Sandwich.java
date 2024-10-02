package Question_5;

public class Sandwich extends Food {
    private String typeOfBread;

    public Sandwich(String name, int calories, int price, String typeOfBread) {
        super(name, calories, price);
        this.typeOfBread = typeOfBread;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The Type of bread is " + this.typeOfBread);
    }
}
