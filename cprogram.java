import java.util.Scanner;
import java.math.BigInteger;

class cprogram {
    public static void main(String[] args) {
        BigInteger fac = BigInteger.ONE;
        for (int i =2; i <= 40; i++) { 
            fac = fac.multiply(BigInteger.valueOf(i));
            System.out.println(fac);
        }
        
    }
}