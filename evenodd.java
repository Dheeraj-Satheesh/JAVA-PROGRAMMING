import java.util.Scanner;

public class evenodd 
{
    public static void main(String args[])
    {
        int e=0,o=0;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the Limit: ");
            int n=in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter a["+i+"] value : ");
                a[i]=in.nextInt();
            }
            for(int element : a)
            {
                if (element%2==0)
                    e++;
                else
                    o++;
            }
        }
        System.out.println("Total even numbers: "+e);
  
        System.out.println("Total odd numbers: "+o);      
}
}
