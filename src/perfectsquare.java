import java.util.Scanner;

public class perfectsquare 
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the given number :");
            int n=in.nextInt();
            double sqrt=Math.sqrt(n);
            if(sqrt*sqrt==n)
            {
                System.out.println("Given number "+n+" is perfect Square");
            }
            else
            {
                System.out.println("Given number "+n+" is not perfect Square");
            }
        }

    }
    
}
