abstract class Figure 
{
    protected double dim1, dim2;
    public Figure(double a, double b) 
    {
        dim1 = a;
        dim2 = b;
    }
    public abstract double area();
}
class Rectangle extends Figure 
{
    public Rectangle(double a,double b)
    {
        super(a, b);
    }
    public double area() 
    {
    System.out.println("Rectangle Area is:");
    return dim1 * dim2;
    }
}
class Triangle extends Figure 
{
    Triangle(double a, double b) 
    {
        super(a, b);
    }
    public double area() 
    {
        System.out.println("Triangle Area is:");
        return dim1 * dim2 / 2;
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        //Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(5, 5);
        //Triangle t = new Triangle(2, 3);
        Figure fr;
        fr = r;
        System.out.println("Area is:"+fr.area());
    }
}