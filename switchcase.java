import java.util.Scanner;
public class switchcase
{
    public static void main(String args[])
{
    int a,b,c,ch;
    System.out.println("1.ADDITION");
    System.out.println("2.SUBTRACTION");
    System.out.println("3.MULTIPLICATION");
    System.out.println("4.DIVISION");
    System.out.println("Enter your choice: ");
    try (Scanner in = new Scanner(System.in)) {
        ch=in.nextInt();
        System.out.println("Enter two numbers: ");
        a=in.nextInt();
        b=in.nextInt();
    }
    switch (ch)
    {
        case 1:
            c=a+b;
            System.out.println("ADDITION: "+c);
            break;
        case 2:
            c=a-b;
            System.out.println("SUBTRACTION: "+c);
            break;
        case 3:
            c=a*b;
            System.out.println("MULTIPLICATION: "+c);
            break;
        case 4:
            c=a/b;
            System.out.println("DIVISION: "+c);
            break;
        default:
            System.out.println("INVALID INPUT");
            break;
    }        
}  
}

