package java_12_type_casting;

public class WrapperClass {
    public static void main(String[] args) {

        // create primitive types
        int intPrimitive = 5;
        double doublePrimitive = 5.65;

        // valueOf()
        Integer intWrapper1 = Integer.valueOf(intPrimitive);
        Double doubleWrapper1 = Double.valueOf(doublePrimitive);

        System.out.println(intWrapper1 instanceof Integer);
        System.out.println(doubleWrapper1 instanceof Double);

        // Autoboxing
        Integer intWrapper2 = intPrimitive;
        Double doubleWrapper2 = doublePrimitive;

        System.out.println(intWrapper2 instanceof Integer);
        System.out.println(doubleWrapper2 instanceof Double);

        intPrimitive = intWrapper1.intValue();
        doublePrimitive = doubleWrapper1.doubleValue();
    }

}

/*
 * ===============
 * Wrapper Class
 * ===============
 * 
 * The wrapper classes in Java are used to convert primitive types (int, char,
 * float, etc) into corresponding objects.
 * 
 * Each of the 8 primitive types has corresponding wrapper classes.
 * 
 * => byte - Byte
 * => short - Short
 * => int - Integer
 * => long - Long
 * => float - Float
 * => double - Double
 * => boolean - Boolean
 * => char - Character
 * 
 * 
 * In Java, sometimes we might need to use objects instead of primitive data
 * types. For example, while working with collections.
 * => ArrayList<int> list = new ArrayList<>(); // Error
 * => ArrayList<Integer> list = new ArrayList<>(); // Runs
 * In such cases, wrapper classes help us to use primitive data types as
 * objects.
 * 
 * We can store the null value in wrapper objects.
 * => int a = null; // Error
 * => Integer a = null; // Runs
 * 
 * Note: Primitive types are more efficient than corresponding objects. Hence,
 * when efficiency is the requirement, it is always recommended primitive types.
 * 
 * ===========================================
 * Autoboxing: Primitive to Wrapper
 * ===========================================
 * 
 * We can use the valueOf() method of wrapper class to convert primitive types
 * into corresponding objects.
 * => Integer num = Integer.valueOf(4);
 * 
 * However, the Java compiler can directly convert the primitive types into
 * corresponding wrapper class objects. This process is known as auto-boxing.
 * => Integer num = 4;
 * 
 * Autoboxing has a great advantage while working with Java collections.
 * => ArrayList<Integer> list = new ArrayList<>();
 * => list.add(5); // Autoboxing
 * 
 * ======================================
 * Unboxing: Wrapper to Primitive
 * ======================================
 * 
 * To convert objects into the primitive types, we can use the corresponding
 * xxxValue() methods (intValue(), doubleValue(), etc) present in each wrapper
 * class.
 * => int num = Integer.valueOf(4).intValue();
 * 
 * However, the Java compiler can automatically convert wrapper class objects
 * into corresponding primitive types. This process is known as unboxing.
 * => int num = Integer.valueOf(4);
 * 
 * Like autoboxing, unboxing can also be used with Java collections.
 * => int a = list.get(0); // Unboxing
 */