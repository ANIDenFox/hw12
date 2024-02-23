public class Main {
    public static void main(String[] args) {
        Order order = new Order("Максим", "Вулиця Перша 1Б, м. Київ", "На розгляді");
        ElectronicsProduct laptop = new ElectronicsProduct("Ноутбук", 1200, 2, "Lenovo");
        order.addProduct(laptop);
        order.displayOrderDetails();
        order.updatePaymentStatus("Заплачено");
        System.out.println("Оновлений статус платежу: " + order.getPaymentStatus());

        GraphicObject rectangle = new Rectangle(10, 20, "Blue", 30, 40);
        GraphicObject circle = new Circle(50, 60, "Red", 25);
        GraphicObject line = new Line(70, 80, "Green", 15);
        rectangle.draw();
        rectangle.move(15, 25);
        rectangle.setColor("Yellow");
        rectangle.draw();
        System.out.println();
        circle.draw();
        circle.move(55, 65);
        circle.setColor("Purple");
        circle.draw();
        System.out.println();
        line.draw();
        line.move(75, 85);
        line.setColor("Orange");
        line.draw();
    }
}