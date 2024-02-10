package method;

public class MethodTest3 {
    public static void main(String[] args) {

        int balance = 10000;

        balance = plus(balance, 1000);
        balance = minus(balance,12000 );
        System.out.println("최종 잔액: " + balance + "원");
    }


    public static int plus(int a, int b) {
        a+=b;
        return a;

    }

    public static int minus(int a, int b) {
        if (a >= b) {
            a -= b;
        } else {
            System.out.println("잔액이 부족합니다");
        }
        return a;
    }
}
