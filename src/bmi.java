import java.util.Scanner;
public class bmi 
{
    public static void main(String[] Strings) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Input weight in pounds: ");
            double weight = in.nextDouble();
            System.out.println("Input height in inches: ");
            double inches = in.nextDouble();
            double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
            System.out.println("Body Mass Index is " + BMI+" ");
        }
    }
}
