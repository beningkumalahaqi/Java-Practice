package myclass;

// Lecturer class which inheritance from person
public class Lecturer extends Person {
    private double salary;
    private String faculty;

    // Constructor
    public Lecturer(int ID, String name, int age, double salary, String faculty) {
        super(ID, name, age);
        this.salary = salary;
        this.faculty = faculty;
    }

    // Getter and Setter Method
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
