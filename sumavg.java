import java.util.Scanner;

public class sumavg 
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the Limit: ");
            int n=in.nextInt();
            int sum=0;
            for(int i=1;i<=n;i++)
            {
                System.out.println("Enter the number "+i+": ");
                int a=in.nextInt();
                sum+=a;
            }
            System.out.println("Sum of given numbers is     : "+sum);
            System.out.println("Average of given numbers is : "+sum/n);
        }
    }

    }
    
