package Sup_person;

public class MainClass {
    
    
    public static void main(String[] args) {
               Student student = new Student("Jeram Tinga", 2003, "Bachelor of Science in Information Technology");

               System.out.println("Student Info: \n\n" + student);
               System.out.println("Student Major: " + student.getMajor()+"\n");

             Instructor instructor = new Instructor("Jemjem", 1989, 70000);

              System.out.println("Instructor Info:\n\n" + instructor);
              System.out.println("Instructor Salary: " + instructor.getSalary());
    }
}
