public class Day12 {
    public static void main(String[] args){
        System.out.println("THIS IS MY NEW CODE");
          //Outer outer=new Outer();
        System.out.println(Outer.x + " a"); 
        Outer outer=new Outer();
         // Outer.Inner inner=new Outer.Inner();
    }
}

//static nested class
class Outer{
   static int x =189;
   int y=76;
    static class Inner{//agr static h to iska object bna skte h 
        //outer k non static variable ko access nhi krr skti h
void fun(){
    System.out.println("inner");
    System.out.println(x);
    System.out.println(y);
}
void fun1(Outer outer){
    System.out.println("inner");
   // System.out.println(x);
    System.out.println(outer.y);
}
    }
}