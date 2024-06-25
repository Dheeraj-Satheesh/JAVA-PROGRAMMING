import java.util.Scanner;
public class oddsum 
{
    public static void main(String[] args) 
	{
		try (Scanner in = new Scanner(System.in))
        {
            System.out.print("Enter the number of odd numbers: " );
            int n=in.nextInt();
            int oddSum = 0;	
            oddSum=n*n;
            System.out.println("The Sum of Odd Numbers upto "+n+" = " + oddSum);
        }
	}
}
