import java.util.*;
public class binarypalindrome {
    public static void main(String args[]) 
    {
       long n1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number: ");
       int num=sc.nextInt();
       sc.close();
       long reverse = 0;
       n1 = num;
       while (n1 > 0)
      {
          reverse <<= 1;
          reverse|=(n1&1);
          n1 >>= 1;
       }
       if(num == reverse) {
          System.out.println("Binary representation of " + num + " is palindrome");
       }else {
          System.out.println("Binary representation of " + num + " is not palindrome");
       }
    }
 }