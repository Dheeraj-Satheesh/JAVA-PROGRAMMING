import java.util.Scanner;
public class amstrongnumber 
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the given number: ");
            int n=in.nextInt();
            int temp=n,t=n;
            int sum=0;
            int rem;
            var count=0;
            while(n!=0)
            {
                n=n/10;
                count=count+1;
            }
            while(temp!=0)
            {
                rem=temp%10;
                sum+=Math.pow(rem,count);
                temp=temp/10;            
            }
            if(sum==t)
            {
                System.out.println("Given number is an amstrong number");
            }
            else
            {
                System.out.println("Given number is not an amstrong anumber");
            }
        }
    }  
}
