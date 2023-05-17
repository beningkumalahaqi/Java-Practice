package myclass;

// Student class which inherintance from Class Person
public class Student extends Person {
    private double GPA;
    private String major;

    // Constructor
    public Student(int ID, String name, int age, double GPA, String major) {
        super(ID, name, age);
        this.GPA = GPA;
        this.major = major;
    }

    // Getter and Setter Method
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
