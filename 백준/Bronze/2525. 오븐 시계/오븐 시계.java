import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = a * 60 + b + c;
        int e = d / 60 % 24; // 24 시간 기준으로 나머지 계산
        int f = d % 60;
        System.out.println(e + " " + f);
        
    }
}

