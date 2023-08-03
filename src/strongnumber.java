import java.util.Scanner;

public class strongnumber 
{
    public static void main(String args[])
    {
        int sum=0,temp;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the given number: ");
            int n=in.nextInt();
            temp=n;
            int rem,fact;
            while(n>0)
            {
                rem=n%10;
                fact=1;
                for(int i= 1;i<=rem;i++)
                {
                    fact*=i;
                }
                sum+=fact;
                n=n/10;
            }
        }
        if(sum==temp)
        {
            System.out.println("Given number "+temp+" is a Strong number");            
        }
        else
        {
            System.out.println("Given number "+temp+" is not a Strong number");
        }
}
}
