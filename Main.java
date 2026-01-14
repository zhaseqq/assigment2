import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Human emp1 = new Employee(30, "Aliya", true, "IT", 75000.50f);
        Employee emp2 = new Employee(35, "Nurlan", true, "Finance", 85000.00f);
        IWorkable emp3 = new Employee(28, "Dana", true, "Marketing", 70000.00f);
        IStudiable emp4 = new Employee(32, "Arman", true, "HR", 72000.00f);

        Human std1 = new Student(20, "Asel", true, "Computer Science", 3.8f);
        Student std2 = new Student(21, "Dias", true, "Business", 3.5f);
        IStudiable std3 = new Student(19, "Madina", true, "Engineering", 3.9f);

        System.out.print("Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Age: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Major: ");
        String studentMajor = scanner.nextLine();

        System.out.print("GPA: ");
        float studentGpa = scanner.nextFloat();

        Student userStudent = new Student(studentAge, studentName, true, studentMajor, studentGpa);

        emp2.displayInfo();
        System.out.println();
        emp2.introduce();
        emp2.work();
        emp2.takeBreak();
        emp2.study();
        emp2.attendClass();
        emp2.celebrate();
        System.out.println();
        std2.displayInfo();
        System.out.println();
        std2.introduce();
        std2.study();
        std2.attendClass();
        std2.celebrate();
        std2.displayUniversity();
        System.out.println();
        System.out.println("Using IWorkable reference (emp3):");
        emp3.work();
        emp3.takeBreak();
        System.out.println();
        System.out.println("Using IStudiable reference (std3):");
        std3.study();
        std3.attendClass();
        System.out.println();
        System.out.println("Employee's department (getter): " + emp2.getDepartment());
        System.out.println("Employee's salary (getter): $" + emp2.getSalary());
        System.out.println("\nChanging department to 'Management' and salary to $95000");
        emp2.setDepartment("Management");
        emp2.setSalary(95000.00f);
        System.out.println("New department: " + emp2.getDepartment());
        System.out.println("New salary: $" + emp2.getSalary());
        System.out.println();
        System.out.println("Student's GPA (getter): " + std2.getGpa());
        System.out.println("Changing GPA to 3.9");
        std2.setGpa(3.9f);
        System.out.println("New GPA: " + std2.getGpa());
        System.out.println();
        System.out.println("Total employees created: " + Employee.getTotalEmployees());
        System.out.println();
        System.out.println("Student's university (final field): " + std2.getUniversity());



        scanner.close();

    }
}
