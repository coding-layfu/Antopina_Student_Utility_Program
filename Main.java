public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        
        student.setDetails("Marilou Antopina", 21, 85.5);

        
        System.out.println("Student Name: " + student.getName());
        student.displayInfo();
    }
}
