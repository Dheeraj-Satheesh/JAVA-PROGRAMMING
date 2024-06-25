import java.util.Arrays;
public class ascendingorder 
{
    public static void main(String args[])
    {
        int[]a=new int[]{8,2,9,7,33,3,87};
        System.out.println("Before sort: "+ Arrays.toString(a));
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if (a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After sort: "+ Arrays.toString(a));     
}
}
