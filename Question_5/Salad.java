package Question_5;

    
public class Salad extends Food {
    private String typeOfDressing;

    public Salad(String name, int calories, int price, String typeOfDressing) {
        super(name, calories, price);
        this.typeOfDressing = typeOfDressing;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type of dressing: " + this.typeOfDressing);
    }

}
