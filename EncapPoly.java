public class EncapPoly {
    public static void main(String[] args) {
    
    }
}
//abstraction =>the process of focusing on the essential features of an object and ignoring the irrelevant details. it is achieved by using abstract classes and interfaces in java. it is used to provide a way to hide the implementation details of an object and to provide a way to access the essential features of an object. it is also used to provide a way to achieve loose coupling between the objects of a class.
//encapsulation =>the process of wrapping the data and the code that manipulates the data into a single unit called class. it is achieved by using access modifiers in java. it is used to provide a way to protect the data from unauthorized access and to provide a way to access the data through the methods of the class. it is also used to provide a way to achieve data hiding in java.
//polymorphism =>the ability of an object to take on many forms. it is achieved by using method overloading and method overriding in java. it is used to provide a way to perform a single action in different ways. it is also used to provide a way to achieve dynamic method dispatch in java.   
class Car{
    void start(){
        System.out.println("car is starting");
    }
    void accelerate(){
        System.out.println("car is accelerating");
    }
    void brake(){
        System.out.println("car is braking");
    }
    void stop(){
        System.out.println("car is stopping");
    }
}

class FuelCar extends Car{

}

class ElectricCar extends Car{
    
}