import java.util.Scanner;
public class asciivalue
{
    public static void main(String args[])
    {
        {  
            System.out.print("Enter a character: ");  
            try (Scanner in = new Scanner(System.in)) 
            {
                char chr = in.next().charAt(0);  
                int asciiValue = chr;  
                System.out.println("ASCII value of " +chr+ " is: "+asciiValue);
            }  
        }  
    }   
}
