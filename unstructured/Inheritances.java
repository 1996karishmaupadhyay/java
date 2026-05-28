public class Inheritances {
    public static void main(String[] args) {
        ScienceStudent student = new ScienceStudent();
        student.display();
        student.displayScience();
        Student student1 = new Student();
        student1.display();
        // student1.displayScience();
    }
}

class Student {
    String name;
    int rollno;

    void display() {
        System.out.println("name: " + name);
        System.out.println("rollno: " + rollno);
    }
}

class ScienceStudent extends Student {

    void displayScience() {
        // super.display(); // super keyword is used to call the parent class method
        System.out.println("this is a science student");
    }
}

// type of inheritance: single inheritance, multilevel inheritance, hierarchical
// inheritance, multiple inheritance, hybrid inheritance
// single inheritance: when a class inherits from another class
// multilevel inheritance: when a class inherits from another class which is
// also inherited from another class
// hierarchical inheritance: when multiple classes inherit from a single class
// multiple inheritance: when a class inherits from multiple classes (not
// supported in Java)
// hybrid inheritance: when a class inherits from multiple classes and also has
// its own properties and methods
