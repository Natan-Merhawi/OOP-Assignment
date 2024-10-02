package Question_5;

public class Boots {
    
    
public class Boot extends Shoes {
    private String typeOfMaterial;

    public Boot(String brand, double price, String typeOfMaterial) {
        super(brand, price);
        this.typeOfMaterial = typeOfMaterial;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type of material of thise boot is " + this.typeOfMaterial);
    }
}
}
