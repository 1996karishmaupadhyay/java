public class Oops {
public static void main(String[] args) {
   Student first=new Student();
   first.name="Karishma";
   first.age=30;
   first.college="DIET";
   first.rollno=462;
   first.attendence();
   first.print();
}
}
  

class Student{
    String name ;
    int rollno;
    String college ;
    int age;
    void attendence(){
        System.err.println(("Attendence done" +name));
    } void print(){
        System.out.println(name+rollno+college+age);;
    }
}
