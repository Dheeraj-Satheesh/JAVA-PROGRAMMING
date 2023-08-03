import java.util.Scanner;
public class multiplicationtables 
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the given table: ");
            int t =in.nextInt();
            System.out.println("Enter the limit      : ");
            int n=in.nextInt();
            for(int i=1;i<=n;i++)
            {
                System.out.println(t+"x"+ i +"="+(t*i));
            }
        }
    }
}
