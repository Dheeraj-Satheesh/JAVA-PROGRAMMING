import java.util.Scanner;

public class primenumberrange 
{
public static void main(String args[])
{
    int a,b,flag,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter start value : ");
    a = sc.nextInt();
    System.out.println("Enter end value : ");
    b = sc.nextInt();
    System.out.println("Prime numbers between "+a+" and  "+b+" are : ");
    while (a < b)
    {
        flag = 0;
        for(i = 2; i <= a/2; ++i)
        {
            if(a % i == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.print(a + " ");
            ++a;
    }
}
}

