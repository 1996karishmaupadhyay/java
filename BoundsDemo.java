// public class BoundsDemo {
//     public static void main(String[] args) {
//         //upcasting
//     // String s="karishma";
//     // Object obj= s;
//     // System.out.println(obj + "this is string to object");
// //downcasting
//     Object obj1= "object to string";
//     String s1= (String) obj1;
//     System.out.println(s1 + "this is object to string");
//     Object obj2=10;
//     String s2=(String) obj2;
//     System.out.println(s2 + "this is object to string");
//     }
// }


public class BoundsDemo {
    public static void main(String[] args) {
Box box1=new Box(10);
box1.getValue();
    }
}


class Box{
    private int value;
   
    Box(int value){
        this.value=value;

    }

    public void getValue(){
        System.out.println("value is: "+value);
    }

    public void setValue(int value){
        this.value=value;
    }
}