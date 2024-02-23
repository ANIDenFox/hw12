public class Product {
    String name;
    private double price;
    private int quantity;
    String brand;

    public Product(String name, double price, int quantity, String brand) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBrand(){
        return brand;
    }
}

