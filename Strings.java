// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         String str="Hello";//String literal
//         System.out.println(str);
//         String str1=new String("Hello");//String object
//         System.out.println(str1);
//         //String pool is a special memory area in Java where string literals are stored. When you create a string literal, Java checks the string pool to see if an identical string already exists. If it does, Java reuses the existing string instead of creating a new one. This is done to optimize memory usage and improve performance. In the example above, both str and str1 will refer to the same string literal "Hello" in the string pool, so they will be equal when compared using the equals() method, but they will not be the same object in memory when compared using the == operator.
//      System.out.println(str.equals(str1)); // this will print true because str and str1 have the same content, even though they are different objects in memory. The equals() method compares the content of the strings, while the == operator compares the references of the objects.
//         System.out.println(str.equalsIgnoreCase(str1)); // this will print true because str and str1 have the same content, even though they are different objects in memory. The equals() method compares the content of the strings, while the == operator compares the references of the objects.
//         System.out.println(str==str1); // this will print false because str and str1 are different objects in memory, even though they contain the same string literal "Hello". The == operator compares the references of the objects, not their content. To compare the content of the strings, you should use the equals() method instead, like this: System.out.println(str.equals(str1)); which will print true because str and str1 have the same content.    
//          System.out.println(str.charAt(0));
//         System.out.println(str.length());
//     // str.charAt(0)='H' // This will cause a compile-time error because strings in Java are immutable
//         System.out.println(str);
//         str="hello changed";// This is valid because we are not changing the original string, we are creating a new string and assigning it to the same reference variable str. The original string "Hello" will still exist in the string pool, but it will not be referenced by the variable str anymore. Instead, str will now reference the new string "hello changed". This is how immutability works in Java strings. When you modify a string, you are actually creating a new string rather than changing the existing one.
//         System.out.println(str);
//         Scanner sc=new Scanner(System.in);
//         String input=sc.nextLine();
//         String input1=sc.next();//only takes the first word as input
//         System.out.println("You entered: " + input);
//         System.out.println("You entered: " + input1);
//         String str2=" kbfbk   ";
//         char[] charArray=str2.toCharArray();
//         for(char c:charArray){
//             System.out.println(c);
//         }
//         System.out.println(charArray[0]);
//         System.out.println(str2.endsWith(str2));
//     }
// }




import java.util.*;
public class Strings {

    public static void print(String str){
        for(int i=0;i<str.length();i++){

            System.out.print(str.charAt(i)+  " ");
        }

    }
    static int getLength(String str){
        int count=0;
        for(char ch:str.toCharArray()){
            count++;
        }
        return count;
    }

    static int getVowels(String str){
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="Hello World";
        print(str);
        int length=getLength(str);
        System.out.println("\nLength of the string is: " + length);
        int vowels=getVowels(str);
        System.out.println("Number of vowels in the string is: " + vowels);

    }
}