import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> st=new HashSet<>();
        Set <Integer> st1=new HashSet<>();
        Set<Integer> st2=new LinkedHashSet<>();
        Set<Integer> st3=new TreeSet<>();
        st.add(78);
        st.add(89);
        st.add(467);
        st.add(78);
        System.out.println(st);
        st1.add(89);
        st1.add(88);
        st1.add(11);
        st.addAll(st1);
        System.out.println(st);
        st.retainAll(st1);
        System.out.println(st);
        System.out.println(st1.containsAll(st));
        st2.add(2);
        st2.add(9);
        st2.add(1);
        st2.add(2);
        System.out.println(st2);

        st3.add(78);
        st3.add(4);
        st3.add(98);
        System.out.println(st3);
        HashSet<Student> students = new HashSet<>();
        Student s1 = new Student(4, "kapil");
        Student s2 = new Student(4, "kapil");
        Student s3 = new Student(4, "kapil");
        Student s4 = new Student(4, "kapil");
        students.add(s1);
          students.add(s2);
            students.add(s3);
              students.add(s4);
              System.out.println(students);
        
    }
}

class Student{
    public int age;
    public String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
}