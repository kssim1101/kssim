import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = a-a*0.22;
        double c = (a*0.8) + ((a*0.2)-(a*0.2*0.22));
        
        System.out.println((int)b+" "+(int)c);
    }
}