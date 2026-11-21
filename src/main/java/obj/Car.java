package obj;

public class Car {
    String brand;
    int year;

    Car(String newBrand, int newYear) {
        this.brand = newBrand;
        this.year = newYear;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void printInfoAboutCar() {
        System.out.println("Car's brand: " + this.brand);
        System.out.println("Car's year: " + this.year);
    }
}
