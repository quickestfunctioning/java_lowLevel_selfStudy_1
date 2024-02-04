package test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String a = input.nextLine();

            if (a.equals("종료")) {
                System.out.println("종료합니닷");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int b = input.nextInt();
//            input.nextLine();
            System.out.println("입력한 이름: " + a + ", 나이: " + b);
        }
    }
}
