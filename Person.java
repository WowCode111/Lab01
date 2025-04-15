


class Person {
    private String name;
    private int id;


    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    
    
    
    public void displayInfo (){
        System.out.println("Student name: " + name);
        System.out.println("Student id: " + id);
    }
}
    class Student extends Person{

        private String gradeLevel;
         
        public Student(String name, int id, String gradeLevel){
            super(name, id);
            this.gradeLevel = gradeLevel;

        }

        @Override
        public void displayInfo (){
            super.displayInfo();
            System.out.println("Grade Level: " + gradeLevel);
        }
    }
    class Teacher extends Person{

        private String subject;
         
        public Teacher(String name, int id, String subject){
            super(name, id);
            this.subject = subject;

        }

        @Override
        public void displayInfo (){
            super.displayInfo();
            System.out.println("Grade Level: " + subject);
        }
    }
    class Staff extends Person{

        private String department;
         
        public Staff(String name, int id, String department){
            super(name, id);
            this.department = department;

        }

        @Override
        public void displayInfo (){
            super.displayInfo();
            System.out.println("Grade Level: " + department);
        }
        
    public class SchoolTest{
        public static void main(String []args){
       
            Student student = new Student("Shane", 1234, "First Year");
            student.displayInfo();
            Teacher teacher = new Teacher("Alex", 1875, "Math");
            teacher.displayInfo();
            Staff staff = new Staff("margo", 1345, "IT department");
            staff.displayInfo();
          }  
          
        }


    }
    



    