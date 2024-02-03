package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫번째 숫자 : ");
            int num1 = scanner.nextInt();

            System.out.print("두번째 숫자 : ");
            int num2 = scanner.nextInt();

            int num3 = num1 + num2;

            if (num1 == 0 && num2 == 0) {
                System.out.println("종료");
                break;
            }
            System.out.println("결과 : "+num3);

        }
    }
}
