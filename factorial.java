import java.util.Scanner;

public class factorial 
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n=in.nextInt();
            int f=1;
            for(int i=1;i<=n;i++)
            {
                f=f*i;
            }
            System.out.println("FACTORIAL OF GIVEN NUMBER "+n+" IS: "+f);
        }
    }  
}
