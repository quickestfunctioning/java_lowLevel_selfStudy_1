package test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input2;
        int input3;
        int input4;
        int price;
        int total = 0 ;

        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int input1 = scanner.nextInt();
            scanner.nextLine();

            if (input1 == 3) {
                break;
            }

            if (input1 == 1) {
                System.out.print("상품명을 입력하세요: ");
                input2 = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                input3 = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                input4 = scanner.nextInt();

                price = input3*input4;

                System.out.println("상품명:"+input2+" 가격:"+input3+" 수량"+input4+" 합계:"+price);

                total += price;
            }
            if (input1 == 2) {
                System.out.println("총 비용은 "+total+"원 입니다");
            }
        }
    }
}
