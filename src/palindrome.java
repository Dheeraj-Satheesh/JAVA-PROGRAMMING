import java.util.Scanner;
public class palindrome 
{
   public static void main(String args[]) 
   {
      try (Scanner in = new Scanner(System.in)) 
      {
         System.out.println("Enter the number : ");
         int n=in.nextInt();
         int reverse=0,rem,temp;
         temp=n;
         while(n!=0)
         {
             rem=temp%10;
             reverse=(reverse*10)+rem;
             temp=temp/10;
         }
         if(reverse==n)
         {
            System.out.println("Given number is palindrome ");
         }
         else
         {
            System.out.println("Given number is palindrome ");
         }
     }
}
}