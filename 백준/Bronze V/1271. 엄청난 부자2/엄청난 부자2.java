import java.util.Scanner;
import java.math.BigInteger;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        
        
        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
    }
}