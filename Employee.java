class Employee extends Human {
    private String department;
    private float salary;
    private static int totalEmployees = 0;

    public Employee(int age, String name, boolean alive, String department, float salary) {
        super(age, name, alive);
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    public String getdepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public void setdepartment(String department) {
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

