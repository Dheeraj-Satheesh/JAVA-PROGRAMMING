import java.util.Scanner;
class Sine
{
    int n,s=1;
    float x,sum;
void getdata()
{
    try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter number of terms: ");
        n=in.nextInt();
        System.out.println("Enter the value of x: ");
        x=in.nextFloat();
    }
}
void series()
{
    int i,j,fact;
    sum=0;
    x=(float)(x*(Math.PI/180));
    for(i=0;i<=n;i=i+2)
    {
        fact=1;
        for(j=1;j<=i;j++)
            fact=fact*j;
        sum=(float)(sum+s*(Math.pow(x,i)/fact));
        s=s*-1;
    }
    System.out.println("The sine series is "+sum);
}
public static void main(String[] args)
{
    Sine s=new Sine();
    s.getdata();
    s.series();
}
}

