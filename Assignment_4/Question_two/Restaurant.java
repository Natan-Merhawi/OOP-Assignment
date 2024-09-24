package Assignment_4.Question_two;

public class Restaurant {
    
    static String restaurantName;
    static int totalTables;
    int tableNumber;

    static {
        restaurantName = "Natan-Treats";
        totalTables = 30;
        System.out.println("Restaurant " + restaurantName + " is open with " + totalTables + " tables.");
    }

    public Restaurant(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public static String getRestaurantName() {
        return restaurantName;
    }

    public static int getTotalTables() {
        return totalTables;
    }

    public static void main(String[] args) {
        Restaurant table1 = new Restaurant(1);
        Restaurant table2 = new Restaurant(2);
        Restaurant table3 = new Restaurant(3);

        System.out.println(">>>>>>>>> Table One <<<<<<<<<");
        System.out.println("The Table number is " + table1.getTableNumber() + " at " + Restaurant.getRestaurantName());
        System.out.println("Total tables in the restaurant: " + Restaurant.getTotalTables());
        System.out.println(">>>>>>>>> Table Two <<<<<<<<<");
        System.out.println("The Table number is " + table2.getTableNumber() + " at " + Restaurant.getRestaurantName());
        System.out.println("The total tables in the restaurant " + Restaurant.getTotalTables());
        System.out.println(">>>>>>>>> Table Three <<<<<<<<<");
        System.out.println("The Table number is " + table3.getTableNumber() + " at " + Restaurant.getRestaurantName());
        System.out.println("The total tables in the restaurant " + Restaurant.getTotalTables());
    }
}
    

