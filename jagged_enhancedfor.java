public class jagged_enhancedfor 
{
    public static void main(String[] args) 
    {
        int a[][]={
            {10,20,30,140},
            {40,50,60},
            {70,80,90,100}
    };
    for(int k[]:a)
    {
        for(int l:k)
        {
            System.out.print(" "+l);
        }
        System.out.println("");
    }
}
}
