import java.util.Scanner;
class Main{
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String a = scanner.next();
        int sum = 0;
        for(int i = 0 ; i<n; i++){
         
            sum += Character.getNumericValue(a.charAt(i));
            
        }
        System.out.println(sum);
    }
}