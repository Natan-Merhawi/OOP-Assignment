package Question_5;
public class OrganicSalad extends Salad {
    private String certification;

    public OrganicSalad(String name, int calories, int price, String typeOfDressing, String certification) {
        super(name, calories, price, typeOfDressing);
        this.certification = certification;
    }

    public String getCertification() {
        return certification;
    }

    public void displayCertification() {
        System.out.println("Certification: " + this.certification);
    }
}