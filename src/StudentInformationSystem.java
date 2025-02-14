import java.util.Scanner;

abstract class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    abstract void displayDetails();
}
class Student extends Person {
    private int rollNumber;
    
    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }
    
    @Override
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    private String subject;
    
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    
    @Override
    void displayDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int studentAge = scanner.nextInt();
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); 
        
        Student student = new Student(studentName, studentAge, rollNumber);
        
        System.out.print("Enter Teacher Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter Teacher Age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();
        
        Teacher teacher = new Teacher(teacherName, teacherAge, subject);
        
        System.out.println("\nStudent Details:");
        student.displayDetails();
        
        System.out.println("\nTeacher Details:");
        teacher.displayDetails();
        
        scanner.close();
    }
}
