//nested class->static,local,inner,annonmus class

public class NestedClasses {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.innerStatic obj = new Outer.innerStatic(o);
        System.out.println(Outer.a);
        System.out.println(obj.outer.b);
        obj.hello();

    }
}

// static nested class is a nested class that is declared static. it can be
// accessed without creating an instance of the outer class. it can access the
// static members of the outer class but cannot access the non-static members of
// the outer class. it can have static and non-static members. it can be
// instantiated without an instance of the outer class. it is also called a
// static inner class.
// inner class non static value ko access nhi kr skta h
class Outer {
    static int a = 78;
    int b = 90;

    static class innerStatic {
        Outer outer;//refrence of outer class

        void hello() {
            System.out.println("hello from inner static class");
        }

        innerStatic(Outer o) {
            this.outer = o;
            System.out.println("constructor of inner static class");
        }
    }
}