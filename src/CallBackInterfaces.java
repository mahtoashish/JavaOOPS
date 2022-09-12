import java.lang.*;
import java.util.*;

interface member{
    void CallBack();
}
class Store{
    member mem[]=new member[100];
    int count=0;
    void register(member m){
        mem[count++]=m;
    }
    void inviteSale(){
        for(int i=0;i<count;i++){
            mem[i].CallBack();
        }
    }
}
class customer implements member{
    String name;
    customer(String n){
        name=n;
    }
    public void CallBack(){
        System.out.println("OK I Will visit "+name);
    }
}
public class CallBackInterfaces {
    public static void main(String arg[]){
        Store s=new Store();
        customer c1=new customer("John");
        customer c2=new customer("Smith");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
