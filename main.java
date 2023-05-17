import myclass.*;

class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person(1, "John Doe", 25);

        // Create a Lecturer object
        Lecturer lecturer = new Lecturer(2, "Jane Smith", 35, 5000.0, "Computer Science");

        // Create a Student object
        Student student = new Student(3, "Alice Johnson", 20, 3.8, "Physics");

        // Access and print information using getter methods
        System.out.println("Person ID: " + person.getID());
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());

        System.out.println();

        System.out.println("Lecturer ID: " + lecturer.getID());
        System.out.println("Lecturer Name: " + lecturer.getName());
        System.out.println("Lecturer Age: " + lecturer.getAge());
        System.out.println("Lecturer Salary: " + lecturer.getSalary());
        System.out.println("Lecturer Faculty: " + lecturer.getFaculty());

        System.out.println();

        System.out.println("Student ID: " + student.getID());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student GPA: " + student.getGPA());
        System.out.println("Student Major: " + student.getMajor());
    }
}
