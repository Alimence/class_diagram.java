
class Student {

    int studentId;
    String name;
    int age;
    String course;

    public Student(int studentId, String name, int age, String course) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(101, "John", 20, "Computer Science");

        student1.displayDetails();
        student1.study();
    }
}
