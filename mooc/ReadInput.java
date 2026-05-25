package mooc;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        //  int main=10;
        //  System.out.println(main);
         Scanner sc= new Scanner(System.in);
        //  int main2 =sc.nextInt();
        //  System.out.println(main2);
         System.out.println("write your first number");
         int first=sc.nextInt();
        System.out.println("write your second number");
         int second=sc.nextInt();
         int ans=first*second;
         System.out.println(ans);
    }
}
