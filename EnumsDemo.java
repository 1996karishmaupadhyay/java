public class EnumsDemo {
    public static void main(String[] args) {
        int status=Payment.SUCCESS;
       System.out.println(status);
       if(status==Role.SUPER_ADMIN){
        System.out.println("Super Admin");
       }
      // PaymentMode mode=PaymentMode.CARD;
       //mode=100;
      // System.out.println(mode.name());

      // Direction D=Direction.NORTH;
//System.out.println(D.degree);
  //     System.out.println(D.getDegree());

//   Direction n=new NorthDirection();
//   n.move();
//   Direction s=new Direction(){
//     @Override
//     public void move(){
//         System.out.println("Moving South");
//     }
//   };
//   s.move();



  TravelVehicle v=TravelVehicle.CAR;
    v.start();


     PaymentMode[] payments=PaymentMode.values();
  for(PaymentMode p:payments){
    System.out.println(p.name());
  }

  PaymentMode mode=PaymentMode.valueOf("CASH");
  System.out.println(mode.name());
  System.out.println(mode.ordinal());
 }
}
 class Payment{
 public static final int SUCCESS=1;
 public static final int FAILURE=0;
 public static final int PENDING=2;
     
}

 class Role{
 public static final int SUPER_ADMIN=1;
 public static final int ADMIN=2;

}

enum PaymentMode{
    CASH, CARD, UPI, NETBANKING;
}

// enum Direction{
//     NORTH(0), SOUTH(180), EAST(90), WEST(270);

//     public int degree;

//     Direction(int degree){
//         this.degree=degree;
//     }

//     public int getDegree(){
//         return degree;
//     }
  
// }

// abstract class Direction{
    
//     public abstract void move();
// }

//  class NorthDirection extends Direction{
//     @Override
//     public void move(){
//         System.out.println("Moving North");
//     }
// }


enum TravelVehicle{
    CAR{
        @Override
        public void start(){
            System.out.println("Car is starting");
        }
    },
         BIKE{
            @Override
            public void start(){
                System.out.println("Bike is starting");
            }
         }
,
         BICYCLE{
            @Override
            public void start(){
                System.out.println("Bicycle is starting");
            }
         };

         abstract void start();
    }
