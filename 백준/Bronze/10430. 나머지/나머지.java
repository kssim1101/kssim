import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = (a+b)%c;
        int e = ((a%c)+(b%c))%c;
        int f = (a*b)%c;
        int g = ((a%c)*(b%c))%c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}