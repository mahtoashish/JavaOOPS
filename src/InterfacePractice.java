import java.lang.*;
import java.util.*;

 interface Test1{
     void meth1();
     void meth2();
}

 interface  Test2{
     void meth3();
     void meth4();
}

class Test3 implements Test1,Test2{
    public void meth1(){
    }
    public void meth2(){

    }
    public void meth3(){

    }
    public void meth4(){

    }
}
public class InterfacePractice {
    public static void main(String arg[]){
        Test3 t=new Test3();
        t.meth1();
        t.meth2();
        t.meth3();
        t.meth4();

    }
}
