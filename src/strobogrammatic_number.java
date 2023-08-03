import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class strobogrammatic_number 
{
    static boolean isStrobogrammatic(String num)
    {
        Map<Character, Character>map=new HashMap<Character, Character>();
        map.put('6','9');
        map.put('9','6');
        map.put('8','8');
        map.put('1','1');
        map.put('0','0');
        int l=0,r=num.length()-1;
        while(l<=r)
        { 
            if(!map.containsKey(num.charAt(l))) return false;
            if(map.get(num.charAt(l))!=num.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number: ");
    String n=sc.next();
    if(isStrobogrammatic(n)==true)
        System.out.println("Given number is Strobogrammatic Number");
    else
        System.out.println("Given number is not a Strobogrmmatic Number");
    sc.close();
}
}
