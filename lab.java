interface Shape { 
   public double getArea();
}
class Rectangle implements Shape 
{ 
   private int length, width;
   public Rectangle(int length, int width) 
   {
      this.length = length;
      this.width = width;
   }
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "]";
   }
   @Override
   public double getArea() {
      return length * width;
   }
}
class Triangle implements Shape 
{
   private int base, height;
   public Triangle(int base, int height) 
   {
      this.base = base;
      this.height = height;
   }
   public String toString() {
      return "Triangle[base=" + base + ",height=" + height + "]";
   }
   @Override
   public double getArea() {
      return 0.5 * base * height;
   }
}
public class lab{
   public static void main(String[] args) 
   {
      Rectangle s1 = new Rectangle(1, 2);  
      System.out.println(s1);
      System.out.println("Area is " + s1.getArea());
      Triangle s2 = new Triangle(3, 4);  
      System.out.println(s2);
      System.out.println("Area is " + s2.getArea());
   }
}