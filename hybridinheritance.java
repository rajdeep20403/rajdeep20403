Welcome to Rajdeep's Coding Hub
  
  class Shape{
    int area;
    public void area()
    {
    System.out.println("Printing the area");
    }
}
class Triangle extends Shape{
    public int l,b;
    public void area(int l,int b)
    {
        this.l=l;
        this.b=b;
        System.out.println(0.5*l*b);
    }
}
class Equilateral extends Triangle
{
    public void area(int l,int b)
    {
        System.out.println(0.5*l*b);
    }
}
class Circle extends Shape{
    public void area(int r)
    {
        System.out.println(3.14*r*r);
    }
}
public class hybridinheritance
{
    public static void main(String args[])
    {
        Triangle t1=new Triangle();
        Equilateral e1=new Equilateral();
        Circle c1=new Circle();
        t1.area(2,3);
        e1.area(1, 2);
        c1.area(1);
    }
}
