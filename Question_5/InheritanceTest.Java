package Question_5;


public class InheritanceTest {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margherita", 300, 15, "Cheeze");
        Sandwich sandwich = new Sandwich("Club", 400, 10, "Wheat");
        Salad salad = new Salad("Garden", 200, 8, "Mozorela");
        OrganicSalad organicSalad = new OrganicSalad("Organic Garden", 250, 12, "Mozororela", "Enjera");

        pizza.displayInfo();
        sandwich.displayInfo();
        salad.displayInfo();
        organicSalad.displayInfo();
        organicSalad.displayCertification();
    }
}