import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 구호 입력 받기
        String slogan = sc.nextLine();

        // 각 구호에 따라 응원 메시지 출력
        if (slogan.equals("SONGDO")) {
            System.out.println("HIGHSCHOOL");
        } else if (slogan.equals("CODE")) {
            System.out.println("MASTER");
        } else if (slogan.equals("2023")) {
            System.out.println("0611");
        } else if (slogan.equals("ALGORITHM")) {
            System.out.println("CONTEST");
        }

        sc.close();
    }
}