import java.util.Scanner;
public class ifelse 
{
    public static void main (String args[])
    {
        int year;
        System.out.println("Enter the year");
        try (Scanner in = new Scanner(System.in)) {
            year=in.nextInt();
        }
        if (year%4==0 || (year%100==0 && year%400==0))
        {
            System.out.println("Given year is leap year");
        }
        else
        {
            System.out.println("Given year is not leap year");
        }
    }
}
