package modificators;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSsn() {
        return this.ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void printPersonInfo() {
        System.out.println("Имя: " + this.firstName + ", Фамилия: " + this.lastName + ", SSN: " + this.ssn);
    }
}
