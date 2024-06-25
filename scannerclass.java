import java.util.Scanner;
public class scannerclass 
{
    public static void main (String args[])
    {
        try (Scanner in = new Scanner(System.in)) 
        {
            int a,b,c;
            System.out.println("Enter two numbers : ");
            a=in.nextInt();
            b=in.nextInt();
            c=(a*a)+(b*b)+(2*a*b);
            System.out.println("RESULT : "+c);
        }
    }
    
}
