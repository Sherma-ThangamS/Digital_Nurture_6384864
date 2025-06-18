package code.week1.MVCPatternExample;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId("S101");
        student.setName("Alice");
        student.setGrade("A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Alice Johnson");
        controller.setStudentGrade("A+");

        System.out.println("\nAfter update:");
        controller.updateView();
    }
}
