import java.util.Scanner;
public class forloop 
{
    public static void main(String args[])
    {
        System.out.println("Enter the limits : ");
        try (Scanner in = new Scanner(System.in)) {
            int n=in.nextInt();
            for(int i=1;i<=n;i++)
            {
                System.out.println(i);
            }
        }
    }
    
}
