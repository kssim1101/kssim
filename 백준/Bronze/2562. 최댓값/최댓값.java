import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < 9; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex + 1);
    }
}