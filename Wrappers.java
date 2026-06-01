public class Wrappers {
    public static void main(String[] args) {
        // This class demonstrates the use of wrapper classes in Java
        // Wrapper classes are used to convert primitive data types into objects and vice versa
        // Each primitive data type has a corresponding wrapper class:
        // - byte: Byte
        // - short: Short
        // - int: Integer
        // - long: Long
        // - float: Float
        // - double: Double
        // - boolean: Boolean
        // - char: Character

        int myInt = 42; // Primitive int
        Integer myInteger = Integer.valueOf(myInt); // Convert int to Integer (boxing)
        System.out.println("Integer object: " + myInteger);

        double myDouble = 3.14; // Primitive double
        Double myDoubleObject = Double.valueOf(myDouble); // Convert double to Double (boxing)
        System.out.println("Double object: " + myDoubleObject);

        boolean isJavaFun = true; // Primitive boolean
        Boolean isJavaFunObject = Boolean.valueOf(isJavaFun); // Convert boolean to Boolean (boxing)
        System.out.println("Boolean object: " + isJavaFunObject);

        char myChar = 'A'; // Primitive char
        Character myCharacterObject = Character.valueOf(myChar); // Convert char to Character (boxing)
        System.out.println("Character object: " + myCharacterObject);

        // Unboxing: Converting wrapper objects back to primitive types
        int unboxedInt = myInteger.intValue(); // Convert Integer back to int (unboxing)
        System.out.println("Unboxed int: " + unboxedInt);

        double unboxedDouble = myDoubleObject.doubleValue(); // Convert Double back to double (unboxing)
        System.out.println("Unboxed double: " + unboxedDouble);

        boolean unboxedBoolean = isJavaFunObject.booleanValue(); // Convert Boolean back to boolean (unboxing)
        System.out.println("Unboxed boolean: " + unboxedBoolean);

        char unboxedChar = myCharacterObject.charValue(); // Convert Character back to char (unboxing)
        System.out.println("Unboxed char: " + unboxedChar);
    }
}
