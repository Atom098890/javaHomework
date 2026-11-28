package modificators;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

    void printInfo() {
        System.out.println("companyName: " + companyName);
        System.out.println("Employee Name: " + this.employeeName);
    }
}
