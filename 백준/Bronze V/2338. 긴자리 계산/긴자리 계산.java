import java.util.Scanner;
import java.math.BigInteger;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
       // long a = scanner.nextLong();
        //long b = scanner.nextLong();
        
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        
    }
    
}