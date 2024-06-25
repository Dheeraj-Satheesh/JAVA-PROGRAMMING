import java.util.*;
class Euclids_algo 
{
    public static int gcd(int a,int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two Integers:");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int g;
        g=gcd(n1,n2);
        System.out.println("GCD is "+g);
        scan.close();
    }
}
