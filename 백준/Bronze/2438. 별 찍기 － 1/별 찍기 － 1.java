import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();        
        for(int i = 1; i<=n; i++){
            for(int o = 1; o<=i; o++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}