import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 성우의 위치와 민건의 집까지의 거리
        //성우는 1분에 1에서 5까지의 거리를 갈수있다
        if(a%5==0){
            System.out.println(a/5);
        }else{
            System.out.println(a/5+1);
        }
    }
}

