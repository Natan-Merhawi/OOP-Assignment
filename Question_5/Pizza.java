package Question_5;

 public class Pizza extends Food {
        private String typeOfCrust;
    
        public Pizza(String name, int calories, int price, String typeOfCrust) {
            super(name, calories, price);
            this.typeOfCrust = typeOfCrust;
        }
    
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("The type of crust is " + this.typeOfCrust);
        }
    }
