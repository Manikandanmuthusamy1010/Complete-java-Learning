public class PrimitiveDataTypes {
    public static void main(String[] args) {

        
        byte b = 100;          // 1 byte
        short s = 10000;       // 2 bytes
        int i = 100000;        // 4 bytes
        long l = 10000000000L; // 8 bytes

        
        float f = 10.5f;       // 4 bytes
        double d = 20.99;      // 8 bytes

        
        char c = 'A';          // 2 bytes (single character)

        
        boolean bool = true;   // true or false

  
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);
    }
}
