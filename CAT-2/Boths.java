import java.util.Scanner;
class Booths
{
    public static int multiply(int n1,int n2)
    {
        int A=n1;
        int B=n2;
        int P=0;
        int count=Integer.SIZE;
        while(count>0)
        {
            if((B&1)==1)
            {
                P+=A;
            }
            A<<=1;
            count --;
            B>>=1;
        }
        return P;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int result=multiply(n1,n2);
        System.out.println("Result : "+result);
        sc.close();
    }
}