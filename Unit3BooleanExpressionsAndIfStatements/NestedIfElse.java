package Unit3BooleanExpressionsAndIfStatements;

public class NestedIfElse {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        // Using in line if statement; is it good?
        if (x < 10) {
            if (y != 3) System.out.println("A");
            else if (y <= 3) System.out.println("B");
            else System.out.println("C");
        } else {
            if(y != 3) System.out.println("D");
            else if (y >= 5) System.out.println("A");
        }
    }
}
