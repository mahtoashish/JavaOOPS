import java.lang.*;
import java.util.*;

class Customer{
    private String name;
    private int phnNo;
    public void PayBill(){

    }

}
class Member extends Customer{
    private String custId;
    private String address;
    private String dob;
    public void CallBack(){

    }
}
public class CustomerAndMember {
    public static void main(String arg[]){
        Customer cust=new Customer();
        Member mem=new Member();
    }
}
