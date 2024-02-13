/*import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
       
        for(int i = 1; i<=t; i++){
        int a = scanner.nextInt();
        int b = scanner.nextInt();            
        System.out.println(a+b);
        
        }       
    }
}*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());        
        for(int i = 0; i<T; i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            
            bw.write((a+b) + "\n");
        }
       bw.flush();
       bw.close(); 
       br.close();
    }
}