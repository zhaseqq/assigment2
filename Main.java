import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Human human1 = new Human(45, "Marat", true);


        Employee employee1 = new Employee(30, "Aliya", true, "IT", 75000.50f);


        System.out.println("Enter Student Information:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Age: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Major: ");
        String studentMajor = scanner.nextLine();

        System.out.print("GPA: ");
        float studentGpa = scanner.nextFloat();

        Student student1 = new Student(studentAge, studentName, true, studentMajor, studentGpa);


        System.out.println("Human information:");
        human1.displayInfo();
        System.out.println();

        System.out.println("Employee information");
        employee1.displayInfo();
        System.out.println();

        System.out.println("Student information");
        student1.displayInfo();
        System.out.println();


        System.out.println("Human's name" + human1.getName());
        System.out.println("Employee's salar" + employee1.getSalary());
        System.out.println("Student's GPA" + student1.getGpa());
        System.out.println();


        System.out.println("Changing human's age from " + human1.getAge() + " to 50");
        human1.setAge(50);

        System.out.println("New major");
        employee1.setdepartment("Management");
        employee1.setSalary(95000.75f);

        System.out.println("New GPA");
        student1.setGpa(3.9f);


        System.out.println("new Human information");
        human1.displayInfo();
        System.out.println();

        System.out.println("new Employee Information");
        employee1.displayInfo();
        System.out.println();

        System.out.println("new Student Information");
        student1.displayInfo();
        System.out.println();



        scanner.close();
    }
}