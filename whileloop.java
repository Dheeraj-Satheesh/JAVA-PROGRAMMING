import java.util.Scanner;

public class whileloop 
{
    public static void main(String args[])
    {
        System.out.println("Enter the limits : ");
        try (Scanner in = new Scanner(System.in)) {
            int n=in.nextInt();
            int i=1;
            while(i<n)
            {
                System.out.println(i);
                i++;
            }
        }
    }
}
