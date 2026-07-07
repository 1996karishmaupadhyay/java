public class DemoClassForInterface {
 
    public static void main(String[] args) {
    //    Bike bike = new Bike();
    //    bike.method1();
    Honda honda = new Honda();
    honda.method1();
    }
}

interface Demo {
    void method1();
    
}
 //one way
// class Bike implements Demo {
//     //@Override
//   public void method1(){
//     System.out.println("Bike is running safely");
//   }
// }

abstract class Bike implements Demo{
    abstract public void method1();
}

class Honda extends  Bike{
    @Override
    public void method1(){
        System.out.println("Honda bike is running safely");
    }
}