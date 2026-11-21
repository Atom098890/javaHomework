package obj;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    public void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }

    public void printInfo() {
        System.out.println("This group's name is " + this.groupName + " has " + this.studentCount + " st");
    }
}
