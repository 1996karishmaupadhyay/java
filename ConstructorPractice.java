public class ConstructorPractice {
 public static void main(String[] args) {
Student s1=new Student();
System.err.println(s1.name);
System.err.println(s1.age);
// s1.name="karishma";
// s1.age=23;
    
 }
}

class Student{
    String name ;
    int age;
}