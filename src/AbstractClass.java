import java.lang.*;
import java.util.*;

abstract class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
    public void meth(){
        System.out.println("Just a test");
    }
    public void meth1(){
        System.out.println("Meth1 Parent");
    }
    abstract public void meth2();
}
 class Child extends Parent{
    public void meth2(){
        System.out.println("Abstract Overrided");
    }
}
public class AbstractClass {
    public static void main(String arg[]){
        Child c=new Child();
        c.meth();
    }
}
