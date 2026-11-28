package modificators;

public class Main {
    public static void main(String[] args) {
        Company.companyName = "Honda";
        Company alex = new Company(1, "Alex");
        Company peter = new Company(2, "Peter");
        Company bob = new Company(3, "Bob");

        Company.printCompanyName();
        alex.printInfo();
        peter.printInfo();
        bob.printInfo();

        System.out.println("-------------------");

        System.out.println(MathConstants.calculateCircleArea(5));
        System.out.println(MathConstants.calculateCircumference(5));
        System.out.println(MathConstants.calculateExponentialGrowth(10, 3, 60));

        System.out.println("-------------------");

        University.universityName = "Hogwarts";
        System.out.println(University.universityName);
        University studentOne = new University(1, "Petya");
        University studentTwo = new University(2, "Bob");
        University studentThree = new University(3, "Peter");
        University.changeUniversityName("Harvard");
        studentOne.printStudentInfo();

        System.out.println("-------------------");
        GameSettings firstGame = new GameSettings("Shark", 0);
        GameSettings secondGame = new GameSettings("Shark", 0);

        GameSettings.setMaxPlayers(10);

        firstGame.printGameStatus();
        firstGame.addPlayer();
        firstGame.printGameStatus();

        secondGame.printGameStatus();

        System.out.println("-------------------");
        Person person = new Person("Alex", "Dubin", "123-45-6789");
        Person secondPerson = new Person("Bob", "Dubin", "123-456-000");
        person.printPersonInfo();

        secondPerson.setFirstName("Kelvin");
        secondPerson.printPersonInfo();
    }
}
