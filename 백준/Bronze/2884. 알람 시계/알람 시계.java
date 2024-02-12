import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        if(m>=45 && h<24 && h>=0){
            System.out.print(h);
            System.out.print(" ");
            System.out.print(m-45);
        }else if(m<45 && h<24 && h>=0){
            System.out.print((h-1+24)%24);
            System.out.print(" ");
            System.out.print(m+15);
        }
    }
}
//23-1 22 22 23 
//0 20 23 35
//0 44 23 59
//0 23 23 38