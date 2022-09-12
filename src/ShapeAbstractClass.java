import java.lang.*;
import java.util.*;

abstract class Shape{
    public Shape(){
        System.out.println("Constructor of Shape");
    }
    abstract public double parameter();
    abstract public double area();
}
class Circle extends Shape{
    public double radius;
    public Circle(){
        System.out.println("Constructor of Circle");
        radius=1;
    }
    public double parameter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    public double length;
    public double breadth;

    public Rectangle(){
        System.out.println("Constructor of Rectangle");
        length=1;
        breadth=1;
    }
     public double parameter(){
        return 2*(length+breadth);
     }
     public double area(){
        return length*breadth;
     }
}
public class ShapeAbstractClass {
    public static void main(String arg[]){
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        c.radius=2.6;
        System.out.printf("%.3f\n",c.parameter());
        r.length=5.6;
        r.breadth=8.9;
        System.out.printf("%.3f\n",r.parameter());
        System.out.printf("%.3f",r.area());

    }
}
