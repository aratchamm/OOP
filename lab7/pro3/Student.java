package pro3;

public class Student extends Person {

    public enum status {
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
    }
    public String statusCode;
    public Student() {
        this.statusCode = "FRESHMAN";
    }

    @Override
    public String toString() {
        return super.toString() + "Student{status=" + status.valueOf(statusCode) + "} ";
    }
}