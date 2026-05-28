package javaseries;

// public class first {
//     public static void main(String[] args) { // main method is the entry point of the program ,its name is fixed and cannot be changed
//         System.out.println("Hello World");
//     }
//    // System.out.println("Hello World"); 
//    // this line will cause a compile time error because it is outside the main method 
//   //Exception in thread "main" java.lang.Error: Unresolved compilation problem:  this error will show if we run the program with the above line uncommented because it is not valid Java code to have executable statements outside of a method.
//    // In Java, all executable code must be inside a method. The main method is the entry point of the program, and any code that you want to execute must be placed inside it or another method that is called from the main method.  
// }



// public class first {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//         display(); // this will cause a compile time error because display method is not static and we are trying to call it from a static context (main method). To fix this, we can either make the display method static or create an instance of the first class and call the display method on that instance.
//     //  public void displays() {
//     //         System.out.println("This is a displays method in main method");
//     //     }  this is invalid because main is a method and a method cannot contain another method inside it. Methods cannot be nested in Java. Each method must be defined at the class level, and you cannot define a method inside another method.
//     }
//     void display() {
//         System.out.println("This is a display method");
//     }
// }


//to get the value from display method there are two way one is to create a instace of a object and call it other is to make this static
// public class first {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//         display(); //this will give the output from display method because i have made the method static
//     //  public void displays() {
//     //         System.out.println("This is a displays method in main method");
//     //     }  this is invalid because main is a method and a method cannot contain another method inside it. Methods cannot be nested in Java. Each method must be defined at the class level, and you cannot define a method inside another method.
//     }
//     static void display() {
//         System.out.println("This is a display method");
//     }
// }


public class first {
    public static void main(String[] args) {
        System.out.println("Hello World");
        first obj = new first(); // creating an instance of the first class
        System.out.println(obj); // this will print the reference of the object in memory, not the actual value of the object. The default toString() method of the first class returns a string that consists of the class name followed by the "@" character and the unsigned hexadecimal representation of the hash code of the object. If you want to print a more meaningful representation of the object, you can override the toString() method in your class to return a string that represents the object's state or properties.
        obj.display(); //this will give the output from display method because i have created an instance of the class
    //  public void displays() {
    //         System.out.println("This is a displays method in main method");
    //     }  this is invalid because main is a method and a method cannot contain another method inside it. Methods cannot be nested in Java. Each method must be defined at the class level, and you cannot define a method inside another method.
    }
     void display() {
        System.out.println("This is a display method");
    }
}