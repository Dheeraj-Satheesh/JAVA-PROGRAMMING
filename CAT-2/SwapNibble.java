import java.util.Scanner;
public class SwapNibble 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.next();
        int number=Integer.parseInt(num,2);
        int swapnum;
        swapnum = ((number & 0x0F) << 4 | (number & 0xF0) >> 4);
        System.out.println("Before swapping the nibble: " + num);
        System.out.println("\n After swapping the nibble: " +swapnum);
        scanner.close();
    }
}