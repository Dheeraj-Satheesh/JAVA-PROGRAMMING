import java.util.Scanner; 
public class diff
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);// reading the array size.
        System.out.println("Enter array size: ");
        int size = in.nextInt();// create an array
        int[] array = new int[size];
        System.out.println("Enter array values :  ");// reading values from user
        for (int i = 0; i < size; i++) {
            int value = in.nextInt();
            array[i] = value;
        }
        int max_val = array[0];
	    int min = array[0];
	    for(int i = 1; i < array.length; i++)
	    {
		    if(array[i] > max_val)
			    max_val = array[i];
		    else if(array[i] < min)
			    min = array[i];
	    }
	    System.out.println("Difference between the largest and smallest values of the said array: "+(max_val-min));	
        in.close();
    }
}