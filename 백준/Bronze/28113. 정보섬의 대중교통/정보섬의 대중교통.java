import java.util.Scanner;
class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //A분 뒤에 일하는곳 앞에 숭실대별관앞에서 집으로 가는 마지막버스
    //B분뒤에 숭실대 입구역에서 집으로 가는 마지막기차
    //찬솔이는 지하철역으로 걸어가서 지하철을 타는것이 버스보다 빠를것으로 판단
    //숭실대별관앞에서 숭실대입구역까지 걸어가는 시간 N분
       int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int subway;
		
		if(n <= b && b == a) {
			System.out.println("Anything");
		}else if(n <= b && b - a > 0) {
			System.out.println("Bus");
		}else {
			System.out.println("Subway");
		}
		sc.close();
	}
}

