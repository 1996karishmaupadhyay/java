import java.util.*;
public class StringQuestion {
    static void reverse(String str){
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
        ans=ans+str.charAt(i);
        }
        System.out.println(ans);
    }
    static void lengthofLastWord(String str){
String[] arr=str.split(" ");
System.out.println(Arrays.toString(arr)); 
int lengthofword=arr[arr.length-1].length();
System.out.println(lengthofword);
    }
   
    public static void main(String[] args) {
        String str="Hello World";
        reverse(str);
        lengthofLastWord(str);
    }
}
