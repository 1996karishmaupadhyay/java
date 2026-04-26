public class StaticFinal {
    public static void main(String[] args) {
        Students.attendence();
    }
}

class Students {
    String name;
    int rollno;
    static String college;
    // jab koi value sare students ke liye same ho to uske liye static variable use
    // karte hai .age kisi ek student k liye nam change krenge to sbke liye change
    // ho jayega

    final double PI = 3.14; // final variable is a constant variable which value cannot be changed
    // variable ka name capital letters me rakhte hai agar varoiable 2 word ka hoga
    // to underscre se join kr denge

    static void attendence() {
        System.out.println("students should attend the class");
    }

    static {
        college = "abc college";
    }

}
// one static method can calll another static method