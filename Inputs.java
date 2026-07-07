import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Inputs {
    public static void main(String [] args)throws Exception{
        int x=System.in.read();
        System.out.print(x);   //read in bytes one by one letter with its asci values
        //aartu create stream buffer 
        InputStreamReader isr=new InputStreamReader(System.in) ;
        BufferedReader br=new BufferedReader(isr);//only read string
        String name = br.readLine();
        System.out.println(name);
        Scanner sc=new Scanner(System.in);
        int z=sc.nextLine();
        System.out.println(z);

    }
}
