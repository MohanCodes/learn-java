package Unit2UsingObjects;

public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.abs(-123.123));
        System.out.println(Math.pow(3, 2.0));
        System.out.println(Math.sqrt(25));
        System.out.println(2 * Math.PI * 12);

        String[] family = {"Hari", "Lavi", "Mohan", "Nirmal"};
        int randNum = (int) (Math.random() * 4);
        System.out.println(family[randNum]);
    }
}
