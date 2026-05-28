public class typeCasting {
    public static void main(String[] args) {
       //types of type casting
       //1. implicit type casting ==>automatic type conversion
         int i=10;
            long l=i; //implicit type casting
            System.out.println("int value is: "+i);
            System.out.println("long value is: "+l);

         //2. explicit type casting ==>manual type conversion
         double d=10.5;
         int j=(int)d; //explicit type casting
         System.out.println("double value is: "+d);
         System.out.println("int value is: "+j);

    }
}
