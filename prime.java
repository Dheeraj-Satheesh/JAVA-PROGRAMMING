import java.util.Scanner;
public class prime 
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the given number: ");
            int n=in.nextInt();
            int f=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    f++;
                }
            }
            if(f==2)
            {
                System.out.println("Given number "+n+" is prime number");
            }
            else
            {
                System.out.println("Given number "+n+" is not a prime number");
            }
        }
}
}
