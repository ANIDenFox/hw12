public class ElectronicsProduct extends Product{

    public ElectronicsProduct(String name, double price, int quantity, String brand) {
        super(name, price, quantity, brand);
        this.name = brand;
    }

    public String getBrand() {
        return brand;
    }
}
