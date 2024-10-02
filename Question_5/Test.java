package Question_5;

public class Test {
    public static void showPrice(Shoes shoes) {
        System.out.println("The price is: " + shoes.getPrice());
    }

    public static void main(String[] args) {
        Shoes sneakerObject = new Sneaker("Nike", 100, "Rubber");
        Shoes bootObject = new Shoes("Timberland", 150);

        System.out.println(">>trial of overriding<<");
        System.out.println("Sneaker price is " + sneakerObject.getPrice());
        System.out.println("And the boot price is " + bootObject.getPrice());

        System.out.println(">>demo method oerloading<< ");
        sneakerObject.displayInfo();
        bootObject.displayInfo();

        System.out.println(">>demo runtime polymorphism<<");
        showPrice(bootObject);
        showPrice(sneakerObject);
    }
}