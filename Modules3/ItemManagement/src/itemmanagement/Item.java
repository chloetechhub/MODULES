package itemmanagement;

public class Item {
    String brand;
    double cost;

    public Item(String brand, double cost) {
        this.brand = brand;
        this.cost = cost;
    }

    public void DisplayItemInfo(){
        System.out.println("brand " + brand);
        System.out.println("cost " + cost);
    }

    public String getBrand() {
        return brand;
    }

    public double getCost() {
        return cost;
    }
}
