public class SchoolTest {
    public static void main(String[] args) {
        Student student = new Student("Shane", 1234, "First Year");
        Teacher teacher = new Teacher("Alex", 1875, "Math");
        Staff staff = new Staff("Margo", 1345, "IT Department");

       
        student.displayInfo();
        teacher.displayInfo();
        staff.displayInfo();
    }
}