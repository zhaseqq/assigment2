class Student extends Human {
    private String major;
    private float gpa;

    public Student(int age, String name, boolean alive, String major, float gpa) {
        super(age, name, alive);
        this.major = major;
        this.gpa = gpa;
    }

    public String getmajor() {
        return major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setmajor(String major) {
        this.major = major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}
