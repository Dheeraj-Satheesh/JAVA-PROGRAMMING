import java.util.Scanner;
public class temperatureconversions 
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) 
        {
            System.out.println("Input a degree in Fahrenheit: ");
            double fahrenheit =in.nextDouble();
            double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
            System.out.println(+celsius);
            System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        }
    }   
}
