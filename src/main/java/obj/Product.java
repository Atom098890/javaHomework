package obj;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void applyDiscount(double discount) {
        double discountAmount = (this.price * discount) / 100;
        this.price -= discountAmount;
    }

    public void printInfo() {
        System.out.println("Product name: " + this.name + ", the price is: " + this.price);
    }
}
