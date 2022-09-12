import java.lang.*;
import java.security.PublicKey;
import java.util.*;

class CellPhone{
    private long phnNo;
    private String imiNo;

    public CellPhone(){

    }
    public CellPhone(long PhnNo,String ImiNo){
        phnNo=PhnNo;
        imiNo=ImiNo;
    }
    public void Call(){

    }
    public void Sms(){

    }
    public void SaveContact(){

    }
    public void DeleteContact(){

    }

}
class SmartPhone extends CellPhone{
    private long mac;
    public void play(){

    }
    public void click(){

    }
    public void capture(){

    }

}
public class CellPhoneSmartPhone {
    public static void main(String arg[]){
        CellPhone cell=new CellPhone();
        SmartPhone smart=new SmartPhone();

    }
}
