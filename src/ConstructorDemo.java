// Q3: Demonstrate classes, constructors (default, parameterized, constructor overloading)
public class ConstructorDemo {

    static class Student {
        String name;
        int age;

        // Default constructor
        Student() {
            this.name = "Unknown";
            this.age = 0;
        }

        // Parameterized constructor
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Riya", 21);

        s1.display();
        s2.display();
    }
}
