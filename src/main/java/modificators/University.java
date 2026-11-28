package modificators;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("Student name: " + studentName + " ID: " + studentID + " University: " + universityName);
    }
}
