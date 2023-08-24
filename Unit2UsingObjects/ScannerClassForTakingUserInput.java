package Unit2UsingObjects;
import java.util.Scanner;

//BMI Calculator

public class ScannerClassForTakingUserInput {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
        System.out.println("How many feet tall are you?");
        double feet = kb.nextDouble();
        System.out.println("How many inches tall are you?");
        double meters = (kb.nextDouble() + (feet * 12)) * 0.0254;
        System.out.println("How many pounds do you weigh?");
        double kilos = kb.nextDouble() / 2.2046;
    
        int bmi = (int) (kilos / Math.pow(meters, 2.0));
    
        if (bmi < 16) {
            System.out.println("Very skinny, your BMI is " + bmi);
        } else if (bmi >= 16 && bmi < 18.5) {
            System.out.println("Little skinny, your BMI is " + bmi);
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Good, your BMI is " + bmi);
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Little fat, your BMI is " + bmi);
        } else {
            System.out.println("Very fat, your BMI is " + bmi);
        }

        kb.close();
    }

}
