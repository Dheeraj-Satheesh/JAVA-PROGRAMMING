import java.util.Scanner;
class karatsuba
{
    public static long karatsuba_multiply(long x,long y)
    {
        if(x<10|| y<10)
        {
            return x*y;
        }
        int n=Math.max(Long.toString(x).length(),Long.toString(y).length());
        int h=(n+1)/2;
        long a=x/(long)Math.pow(10,h);
        long b=x%(long)Math.pow(10,h);
        long c=x/(long)Math.pow(10,h);
        long d=x%(long)Math.pow(10,h);
        long ac=karatsuba_multiply(a,c);
        long bd=karatsuba_multiply(b,d);
        long e=karatsuba_multiply(a+b,c+d)-ac-bd;
        return(long)(ac*Math.pow(10,2*h)+e*Math.pow(10,h)+bd); 
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n1=sc.nextLong();
        long n2=sc.nextLong();
        System.out.println("Result is:"+ karatsuba_multiply(n1, n2));
        sc.close();
    }
}