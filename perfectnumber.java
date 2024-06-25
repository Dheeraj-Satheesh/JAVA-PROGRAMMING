import java.util.Scanner;
public class perfectnumber 
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the given number: ");
            int n=in.nextInt();
            int sum=0;
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum+=i;
                }
            }
            if(sum==n)
            {
                System.out.println("Given number "+n+" is a perfect number"); 
            }
            else
            {
                System.out.println("Given number "+n+" is not a perfect number");
            }
        }
}
}
