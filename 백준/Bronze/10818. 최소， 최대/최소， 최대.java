import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n; i++){ // 입력된 정수값 읽기
            a[i] = scanner.nextInt();
        }
        int min = a[0];
         int max = a[0];
        for(int i = 1; i<n; i++){
            if(a[i]<min){
                min=a[i];
            }else if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(min + " " + max);

    }
}