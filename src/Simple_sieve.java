import java.util.*;
public class Simple_sieve
{
    public static void simple_sieve(int limit) 
    {
        boolean[] prime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) 
        {      
            prime[i] = true;
        }
        for(int p=2;p*p <=limit;p++)
        {
            if(prime[p]==true)
            {
                for(int i=p*p;i<=limit;i+=p)
                {
                    prime[i]=false;
                }   
            }         
        }
        for(int p=2;p<=limit;p++)
        {
            if(prime[p]==true )
            {
                System.out.print(p+" ");
            }
        }
     }
     public static void main(String[]args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int limit=sc.nextInt();
        simple_sieve(limit);
        sc.close();
     }
}