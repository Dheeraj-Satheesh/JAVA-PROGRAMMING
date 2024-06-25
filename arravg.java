import java.util.Scanner;
public class arravg 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);// reading the array size.
        System.out.println("Enter array size: ");
        int size = in.nextInt();// create an array
        float[] array = new float[size];
        System.out.println("Enter array values :  ");// reading values from user
        for (int i = 0; i < size; i++) {
            float value = in.nextFloat();
            array[i] = value;
        }
        float length = array.length;// getting array length
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // sum of all values in array using for loop
        }
        float average = sum / length;
        System.out.println("Average of array : " + average);
        in.close(); 
    }
}
    
