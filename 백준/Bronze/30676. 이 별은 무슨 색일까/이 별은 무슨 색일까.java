import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=620&&a<=780){
            System.out.println("Red");
        }else if(a>=590&&a<620){
            System.out.println("Orange");
        }else if(a>=570&&a<590){
            System.out.println("Yellow");
        }else if(a>=495&&a<570){
            System.out.println("Green");
        }else if(a>=450&&a<495){
            System.out.println("Blue");
        }else if(a>=425&&a<450){
            System.out.println("Indigo");
        }else{
            System.out.println("Violet");
        }
}
}