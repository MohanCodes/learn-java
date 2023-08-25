package Unit3BooleanExpressionsAndIfStatements;

public class CheckingEquality {
    public static void main(String[] args) {
        // primitive data types can be compared using a == b
        // Using ==  to compare two reference (object) type variables will only check if they are pointing at the same object.
        // Reference type variables can be compared using a.equals(b).
        // "Shallow"; For some classes, this will check if they are pointing at the same object.
        // "Deep"; In other classes, it will check if they are pointing at equivalent objects.
        // boolean, char, byte, short, int, long, float, double

        int a = 3;
        int b = 3;
        double c = 3.0;
        double d = 3.0;
        boolean e = false;

        System.out.println(e);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(c == 3.0);
        System.out.println(a == d); // a will be converted to the double datatype and then compared
        //System.out.println(c == e); error - incompatible types
        //System.out.println(c == e); error - incompatible types

        //Other objects may have alternative methods to compare their contents
            // Arrays.equals()
    }
}
