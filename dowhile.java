import java.util.Scanner;

public class dowhile 
{
    public static void main(String args[])
{
    System.out.println("Enter the limits : ");
    try (Scanner in = new Scanner(System.in)) {
        int n=in.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=n);
    } 
}  
}
