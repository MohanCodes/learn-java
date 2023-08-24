package Unit2UsingObjects;

public class StringAndStringMethods {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";

        String c = new String("hello");
        String d = new String("hello");

        System.out.println(a == b); //true, because they are pointing to the same location in the stack
        System.out.println(c == d); // false, because they are pointing to different locations in the stack
        
        System.out.println(a.equals(b)); //pointing to objects that are equivalent to each other
        System.out.println(c.equals(d));

        a = "hola";
        System.out.println(a == b);

        String e = "HOLA";
        System.out.println(e.equalsIgnoreCase(a));
    }
}
