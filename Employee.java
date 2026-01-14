class Employee extends Human implements IWorkable, IStudiable {
    private String department;
    private float salary;
    private static int totalEmployees = 0;

    public Employee(int age, String name, boolean alive, String department, float salary) {
        super(age, name, alive);
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", an employee in " + department + " department.");
    }

    @Override
    public void work() {
        System.out.println(name + " is working in " + department + " department.");
    }

    @Override
    public void takeBreak() {
        System.out.println(name + " is taking a coffee break.");
    }

    @Override
    public void study() {
        System.out.println(name + " is studying new professional skills.");
    }

    @Override
    public void attendClass() {
        System.out.println(name + " is attending a professional training class.");
    }

    public String getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("Employee ID: EMP-" + getTotalEmployees());
    }
}

