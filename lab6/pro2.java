public class pro2 {
    public static void main(String[] args) {
        Course course = new Course("Math");
        course.addStudent("kor");
        course.addStudent("khor");
        course.addStudent("kror");
        course.dropStudent("khor");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println("Student " + (i + 1) + " is " + course.getStudents()[i]);
        }
    }
}