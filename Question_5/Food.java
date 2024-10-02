package Question_5;

public class Food{
    private String name;
    private int calories;
    private int price;

    public Food(String name, int calories, int price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("The Food name is " + this.name);
        System.out.println("The Amount of Calaries is " + this.calories);
        System.out.println("the Price is " + this.price);
    }
}
    

