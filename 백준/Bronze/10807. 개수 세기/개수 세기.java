import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        int count = 0;
         for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int v = scanner.nextInt();
        for(int i = 0; i<a.length; i++){
        if(a[i]==v){
            count++;
        }
    }
        System.out.println(count);
    }
}

