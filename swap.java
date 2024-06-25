import java.util.Scanner;
public class swap 
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) 
        {
            System.out.println("Enter the First number: ");
            int a=in.nextInt();
            System.out.println("Enter the Second number: ");
            int b=in.nextInt();
            int temp;
            temp=a;
            a=b;
            b=temp;
            System.out.println("After Swapping value of is : " +a);
            System.out.println("After Swapping value of is : " +b);
        }
    }  
}
