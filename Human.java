class Human {
    private int age;
    private String name;
    private boolean alive;
    public Human(int age, String name, boolean alive) {
        this.age = age;
        this.name = name;
        this.alive = alive;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean alive() {
        return alive;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void alive(boolean alive) {
        this.alive = alive;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Alive: " + (alive ? "Yes" : "No"));
    }

    public void celebrate() {
        System.out.println(name + " is celebrating a special occasion!");
    }
}
