public class ConstructorPractice {
 public static void main(String[] args) {
// Student s1=new Student();
Student s1=new Student("karishma",23); 
Student s2=new Student("karishma");
Student s3=new Student(23);
System.out.println(s1.name); //this will print null because we have not assigned any value to name and age variable .it will get these values from default constructor of student class.    
System.out.println(s1.age);
// s1.name="karishma";
// s1.age=23;
System.out.println(s2.name + " " + s2.age); 
System.out.println(s3.name + " " + s3.age);
 }
}

class Student{
    String name ;
    int age;
    Student(){
        name="unknown";
        age=0;  
        System.out.println("default constructor is called");
    }
    Student(String name){
        this.name=name;
        System.out.println("constructor with string parameter is called");
    }

    Student (int age){
        this("karishjmsuh", age);
        System.out.println("constructor with int parameter is called");
    }

    Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("constructor with string and int parameter is called");
    }
}

//constructor overloading is a concept in java where we can have multiple constructors with different parameters in the same class. it is used to initialize the object of the class in different ways. it is also used to provide different ways to create an object of the class.    
//constructor chaining is a concept in java where we can call one constructor from another constructor in the same class. it is used to avoid code duplication and to provide a way to initialize the object of the class in different ways. it is also used to provide different ways to create an object of the class.    
