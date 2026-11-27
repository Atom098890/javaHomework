package obj;

public class Laptop {
    int price;
    String brand;

    Laptop(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public int getPrice() {
        return this.price;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("Laptop brand is: " + this.brand + ", price: " + this.price + "_RUB");
    }
}
