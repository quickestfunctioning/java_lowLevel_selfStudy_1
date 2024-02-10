package method;

import java.util.Scanner;

public class MethodTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int balance = 0;

        while(true) {
            System.out.println("1.입금 / 2.출금 / 3. 잔액 확인 / 4. 종료");
            int select = sc.nextInt();

            if (select == 1) {
                System.out.print("입금액을 입력하세요: ");
                int a = sc.nextInt();
                balance = in(balance, a);
                System.out.println(a+"원을 입금하였습니다. 현재 잔액: "+balance+"원");
                System.out.println();

            } else if (select == 2) {
                System.out.print("출금액을 입력하세요: ");
                int a = sc.nextInt();
                balance = out(balance, a);
                System.out.println("현재 잔액: "+balance+"원");
                System.out.println();

            } else if (select == 3) {
                System.out.println("현재 잔액: "+balance+"원");
                System.out.println();

            } else if (select == 4) {
                System.out.println("시스템을 종료합니다");
                break;

            } else {
                System.out.println("다시 입력하세요");
                System.out.println();
                continue;
            }
        }
    }

    public static int in(int a, int b){
        a += b;
        return a;
    }

    public static int out(int a, int b){
        if(a>=b){
            a-=b;
            System.out.print(b+"원을 출금하였습니다. ");
        } else {
            System.out.println("한도초과");
        }
        return a;
    }
}
