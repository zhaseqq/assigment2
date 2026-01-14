final class Student extends Human implements IStudiable {
    private String major;
    private float gpa;
    private final String UNIVERSITY = "Astana IT University";

    public Student(int age, String name, boolean alive, String major, float gpa) {
        super(age, name, alive);
        this.major = major;
        this.gpa = gpa;
    }
    @Override
    public void introduce() {
        System.out.println("Hello, I'm " + name + ", a student majoring in " + major + ".");
    }
    @Override
    public void study() {
        System.out.println(name + " is studying " + major + " at " + UNIVERSITY + ".");
    }

    @Override
    public void attendClass() {
        System.out.println(name + " is attending a " + major + " class.");
    }

    public final void displayUniversity() {
        System.out.println("University: " + UNIVERSITY);
    }
    public String getMajor() {
        return major;
    }

    public float getGpa() {
        return gpa;
    }

    public String getUniversity() {
        return UNIVERSITY;
    }

    public void setMajor(String major) {
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
        displayUniversity();
    }
}

