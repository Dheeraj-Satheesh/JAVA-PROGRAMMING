import java.util.Scanner;
public class groupswitchcase 
{
        public static void main(String args[])
        {
            char c;
            System.out.println("Enter the character: ");
            try (Scanner in = new Scanner(System.in)) {
                c=in.next().charAt(0);
            }
            switch (c)
            {
            case 'a':
            case 'e':
            case 'i':
            case '0':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c +" is a vowel");
                break;
            default:
                System.out.println(c +" is a consonant");
                break;
        }   
}
}
