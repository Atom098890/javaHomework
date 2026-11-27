package obj;

public class Main {
    public static void main(String[] args) {
        // Car
        Car car = new Car("Toyota", 1990);
        car.printInfoAboutCar();
        car.setYear(2003);
        car.printInfoAboutCar();
        String toyotaBrand = car.getBrand();
        System.out.println("Brand: " + toyotaBrand);
        System.out.println("------------------------");

        // Rectangle
        Rectangle rectangle = new Rectangle(10, 15);
        int s1 = rectangle.calculateArea();
        System.out.println("S = " + s1);
        rectangle.setWidth(25);
        int s2 = rectangle.calculateArea();
        System.out.println("S = " + s2);
        System.out.println("Height: " + rectangle.getHeight());

        System.out.println("------------------------");

        // Book
        Book animalFarm = new Book("Animal Farm", "Joe Oruel");
        animalFarm.printInfo();
        animalFarm.setAuthor("Alex Pushkin");
        animalFarm.printInfo();

        System.out.println("------------------------");

        // BankAccount
        BankAccount accountOne = new BankAccount(0.0, "Peter");
        accountOne.printBalance();
        accountOne.deposit(1200);
        accountOne.printBalance();
        accountOne.withdraw(550);
        accountOne.printBalance();

        System.out.println("------------------------");

        // Point
        Point c1 = new Point(5, 10);
        c1.print();
        c1.setX(-7);
        c1.print();

        System.out.println("------------------------");

        // StudentGroup
        StudentGroup firstCourse = new StudentGroup("43A", 25);
        firstCourse.printInfo();
        firstCourse.setStudentCount(30);
        firstCourse.printInfo();

        System.out.println("------------------------");

        // Circle
        Circle circle = new Circle(7);
        System.out.println("calculateArea: " + circle.calculateArea());
        System.out.println("calculateCircumference: " + circle.calculateCircumference());

        circle.setRadius(3);

        System.out.println("calculateArea: " + circle.calculateArea());
        System.out.println("calculateCircumference: " + circle.calculateCircumference());

        System.out.println("------------------------");

        // Teacher
        Teacher firstTeacher = new Teacher("Alex", "Math");
        firstTeacher.printInfo();
        firstTeacher.setSubject("Biology");
        firstTeacher.printInfo();

        System.out.println("------------------------");

        // Product
        Product milk = new Product("Milk", 25);
        milk.printInfo();
        milk.setPrice(18.0);
        milk.applyDiscount(10);
        milk.printInfo();

        System.out.println("------------------------");

        // Laptop
        Laptop lenovo = new Laptop(20000, "Lenovo");
        lenovo.printInfo();
        lenovo.setPrice(35000);
        lenovo.printInfo();
    }
}
