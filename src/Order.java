import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private String customer;
    private String deliveryAddress;
    private String paymentStatus;

    public Order(String customer, String deliveryAddress, String paymentStatus) {
        this.products = new ArrayList<>();
        this.customer = customer;
        this.deliveryAddress = deliveryAddress;
        this.paymentStatus = paymentStatus;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void updatePaymentStatus(String newStatus) {
        paymentStatus = newStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void displayOrderDetails() {
        System.out.println("Замовник: " + customer);
        System.out.println("Адреса доставки: " + deliveryAddress);
        System.out.println("Статус оплати: " + paymentStatus);
        System.out.println("Продукт:");
        for (Product product : products) {
            System.out.println("  - " + product.getName() + ": " + product.getQuantity() + " x $" + product.getPrice() + " "+ product.getBrand());
        }
    }
}
