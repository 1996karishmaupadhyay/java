public class Interfaces {
    public static void main(String[] args) {
        Vehicle car1 = new FuelCar();
        Vehicle car2 = new ElectricCar();
        car1.start();
        car1.accelerate();      
        car1.brake();
        car2.start();
        car2.accelerate();
        car2.brake();
    }
}
interface Vehicle {
    void start();
    void accelerate();
    void brake();
}

class FuelCar implements Vehicle{
   
@Override
public void start() {   
    System.out.println("fuel car is starting");
}
    @Override
    public void accelerate() {
        System.out.println("fuel car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("fuel car is braking");
    }
}

class ElectricCar implements Vehicle{

    @Override
    public void start() {
        System.out.println("electric car is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("electric car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("electric car is braking");
    }
    
}   