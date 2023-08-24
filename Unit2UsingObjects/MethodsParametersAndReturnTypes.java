package Unit2UsingObjects;

public class MethodsParametersAndReturnTypes{
    public static void main(String[] args) {
        int sum = addTwoNums(5, 3);
        int avg = averageOfTwo(7, 5);
        print(sum + avg);
    }

    public static int addTwoNums(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

    public static int averageOfTwo(int numA, int numB) {
        return addTwoNums(numA, numB);
    }

    public static void print(int num3) {
        System.out.println("Number is " + num3);
    }
}