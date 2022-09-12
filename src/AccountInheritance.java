import java.lang.*;
import java.util.*;

class Account{
    private long accNo;
    private String name;
    private String address;
    private long phnNo;
    public String dob;
    public long balance;

    public Account(){

    }
    public Account(long AccNo,String Name,String Address,long PhnNo,String DOB){
        accNo=AccNo;
        name=Name;
        address=Address;
        setPhnNo(PhnNo);
        dob=DOB;
        balance=0;
    }
    public long getAccNo(){
        return accNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){return address;}
    public String getDob(){ return dob;}
    public long getBalance(){ return balance;}

    public void setPhnNo(long PhnNo){
        phnNo=PhnNo;
    }
    public void setBalance(long Balance){
        if(Balance<0){
            balance=balance-Balance;
        }
        else if(Balance==0){
            balance=0;
        }
        else{
        balance=balance+Balance;
        }
    }
    public void close(){
        accNo=0;
        name="Nothing";
        address="Nothing";
        phnNo=0;
        dob="Nothing";
        balance=0;
    }
    public String toString(){
        return "AccountNo. "+accNo+"\nName "+name+"\nAddress "+address+"\nPhoneNo. "+phnNo+"\nDateOfBirth "+dob+"\nBalance "+balance;
    }


}
class SavingAccount extends Account{
    public long fixedDeposit;

    public void Withdraw(long amount){

    }
    public void Deposit(long amount){

    }
    public void FixedDeposit(long fix){

    }
    public void liquidate(){

    }
}
class LoanAccount extends  Account{
    public void PayEmi(){

    }
    public void TopUpLoan(){

    }
    public void Repayment(){

    }
}
public class AccountInheritance {
    public static void main(String arg[]){
        Account acc=new Account(2002220100042l,"Aryan","4/126 RajNagar",7011734650l,"14/11/2002");
        System.out.println(acc);
        acc.setBalance(300000);
        SavingAccount acc1=new SavingAccount();
        acc1.Withdraw(2000);
        System.out.println();
        System.out.println(acc1.getDob());

    }
}
