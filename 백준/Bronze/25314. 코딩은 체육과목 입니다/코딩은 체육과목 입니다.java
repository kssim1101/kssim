import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //바이트 크기        
        int l = n / 4 ;
        for(int i = 1; i<=l; i++){
            System.out.print("long ");
        }        
            System.out.print("int");
        
    }
}