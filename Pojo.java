  class Car{
    String color;
    int speed;

    void start(){
        System.out.println("Car started");
    }

 } 

// public class Pojo {
//     public static void main(String[] args) {
//       Car car1=new Car();
//       car1.color="blue";
//       car1.speed=100;
//       System.out.println("Car color: "+car1.color); 
//         System.out.println("Car speed: "+car1.speed);
//         car1.start();
//     }
// }


//pojo

// only one class can be public in a java file and the name of the public class should be same as the file name.   
// if want to create multiple classes in a single file then only one class can be public and the rest of the classes should be non-public. 


// primitives dattype to ko same name ki class milti h jo heap m store hoti h usko wrapper class kehte h.
// ur stack m uska reference store hota h.
// y isiilye hota h kyuki hum collections m bus classes se hi deal krte hai to wrapper class ke through hi primitives ko collections m store kar sakte hai.


// auto-boxing: converting primitive to wrapper class object
// auto-unboxing: converting wrapper class object to primitive
// example:

// int num=10; //primitive
// Integer numObj=num; //auto-boxing

// unboxing example:
// Integer numObj=20; //wrapper class object   
// int num=numObj; //auto-unboxing
 

// jab hum integer a ur b ko equal k liye check krte h to false output hota h kyuki dono k refrenve alag hote hai 
// lakin agr hum a.intValue() == b.intValue() check kare to true output hota h kyuki dono k value same hoti hai.   
// ya phir hum a.equals(b) check kare to bhi true output hota h kyuki equals method value ko compare karta hai na ki reference ko. 
// agr hum valueOf() method ka use kare to bhi true output hota h kyuki valueOf() method bhi value ko compare karta hai.   


//abstract  class:
//cannot be instantiated
// can contain abstract method 
// can contain normal mmethods
// is meant to be inherited by other classes
// can have constructors and static methods
// can have instance variables and static variables:




public class Pojo {
    public static void main(String[] args) {
       Animal animal=new Dog("Buddy");
       animal.makeSound();
       animal.sleep();

    }
}


abstract class Animal{
String name;
  
    abstract void makeSound();

    void sleep (){
        System.out.println("Animal is sleeping");
    }
    Animal(String name){
        this.name=name;
          System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
    Dog(String name){ 
        super(name);
    }
}
