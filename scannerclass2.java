import java.util.Scanner;
public class scannerclass2 
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)){
            String a,b,c;
            a=in.next();
            b=in.next();
            c=a+' '+b;
            System.out.println(a);
            System.out.println(b);
            System.out.println("AFTER CONCATENATING : "+c);}
    }
}
