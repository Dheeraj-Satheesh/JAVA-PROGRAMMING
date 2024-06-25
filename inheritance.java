class A 
{
    int i, j;
    void showij() 
    {
        System.out.println("i and j:" + i + " " + j);
    }
}
class B extends A {
    int k;
    void showk()
    {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("Sum is: " + (i + j + k));
    }
}
public class inheritance{
    public static void main(String[] args) {
        A aOb = new A();
        B bOb = new B();
        aOb.i = 10;
        aOb.j = 20;
        System.out.println("Contents of AOb:");
        aOb.showij();
        System.out.println();
        bOb.i = 7;
        bOb.j = 8;
        bOb.k = 9;
        bOb.showij();
        bOb.showk();
        bOb.sum();
    }
}