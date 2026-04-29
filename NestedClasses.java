public class NestedClasses {
    public static void main(String[] args) {
       Outer a=new Outer();

    }
}
//static nested class is a nested class that is declared static. it can be accessed without creating an instance of the outer class. it can access the static members of the outer class but cannot access the non-static members of the outer class. it can have static and non-static members. it can be instantiated without an instance of the outer class. it is also called a static inner class. 

class Outer{
    
    static class innerStatic {
        System.out.println("this is a static nested class");
    }
}