import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // 영수증의 총금액
        int n = scanner.nextInt(); // 물건의 종류의수
        int sum = 0;
        for(int i = 0; i<n; i++){
        int a = scanner.nextInt(); //물건의 가격
        int b = scanner.nextInt(); //물건의 개수
                sum+=a*b;           
        }
         if(x  == sum){
                System.out.println("Yes");
                
            }else{
                System.out.println("No");
            }
    }
}