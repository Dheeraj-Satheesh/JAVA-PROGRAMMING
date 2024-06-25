import java.util.Scanner;
public class IF 
{
    public static void main (String args[])
    {
        int age;
        System.out.println("Enter your age: ");
        try (Scanner in = new Scanner(System.in)) {
            age=in.nextInt();
        }
        if (age>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible for vote");
        }
    }
}
