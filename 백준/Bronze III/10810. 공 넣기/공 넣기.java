import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();// 바구니 수
        int m = scanner.nextInt();// 공을 넣으려는 횟수
        int arr[] = new int[n+1]; //

        for(int i = 0; i<m; i++){ //  공을 넣으려는 횟수 만큼 반복문
            int num1 = scanner.nextInt();// 바구니번호
            int num2 = scanner.nextInt();// 바구니번호
            int num3 = scanner.nextInt();//공의번호
                
            for(int j = num1; j<=num2; j++){
                arr[j] = num3;
            }
        }
        for(int i = 1; i<=n; i++){ //출력 0인덱스부터
            System.out.print(arr[i] + " ");
        }
    }
}
