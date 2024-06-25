import java.util.Scanner;
public class nestedif 
{
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the martial status : ");
            char martial=in.next().charAt(0);
            if(martial=='u' || martial=='U')
            {
                System.out.println("Enter the Gender m/f: ");
                char gender=in.next().charAt(0);
                System.out.println("Enter the Age    : ");
                int age=in.nextInt();
                if((gender =='M'||gender =='m') && age>=30)
                {
                    System.out.println("You are eligible for insurance");
                }
                else
                {
                    System.out.println("You are not eligible for insurance");
                }
            }
            else if(martial=='m'|| martial=='M')
            {
                System.out.println("You are eligible for insurance");
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
        }      
    }  
}
