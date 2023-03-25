import java.util.*;
public class OtpGen {
    public static void main(String[] args) {
    String num="0123456789";
    int l=4;
    char[] otp=new char[l];
    Random r=new Random();
    for(int i=0;i<l;i++){
        otp[i]=num.charAt(r.nextInt(num.length()));

    }
    System.out.println("YOUR OTP is : "+new String(otp));    
   }
}
