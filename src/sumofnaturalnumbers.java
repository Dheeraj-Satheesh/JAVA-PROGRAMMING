import java.util.Scanner;
public class sumofnaturalnumbers 
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) 
        {
            System.out.println("Enter the number of Natural numbers: ");
            int n=in.nextInt();
            int sum=0;
            for(int i = 1; i <=n; ++i)
            {
                sum+= i;
            }
            System.out.println("Sum = " + sum);
        }
    }   
}
