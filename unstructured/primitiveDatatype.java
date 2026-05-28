public class primitiveDatatype {
      public static void main(String[] args) {
        //byte takes 1 byte of memory and its range is from -128
        // to 127
        byte b1=-128;
        byte b2=127;
        System.out.println("byte value is: "+b1);
        System.out.println("byte value is: "+b2);
        //short takes 2 bytes of memory and its range is from -32768
        // to 32767
        short s1=-32768;
        short s2=32767; 
        System.out.println("short value is: "+s1);
        System.out.println("short value is: "+s2);

        //int takes 4 bytes of memory and its range is from -2147483648
        // to 2147483647
        int i1=-21474;
        int i2=23647;
        System.err.println("int value is: "+i1);
        System.err.println("int value is: "+i2);

        //long takes 8 bytes of memory and its range is from -9223372036854775808
        // to 9223372036854775807
        long l1=-775808;
        long l2=9223372;
        System.err.println("long value is: "+l1);
        System.err.println("long value is: "+l2);

        //float takes 4 bytes of memory and its range is from 1.4E-45 to 3.4028235E38
        float f1=145.878f;
        float f2=3.8f;
        System.err.println("float value is: "+f1);
        System.err.println("float value is: "+f2);

        //double takes 8 bytes of memory and its range is from 4.9E-324 to 1.7976931348623157E308
        double d1=4.88580536898;     
        double d2=1.7976931348623;
        System.err.println("double value is: "+d1);
        System.err.println("double value is: "+d2);

        //char takes 2 bytes of memory and its range is from '\u0000' to '\uffff'
        char c1='h';
        char c2='k';
        System.err.println("char value is: "+c1);
        System.err.println("char value is: "+c2);

//boolean takes 1 byte of memory and its range is from true to false
        boolean bool1=true;
        boolean bool2=false;
        System.err.println("boolean value is: "+bool1);
        System.err.println("boolean value is: "+bool2);
    } 
}
