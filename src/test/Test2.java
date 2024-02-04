package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하나의 정수를 입력하세요");
        int a = scanner.nextInt();

        String b = ((a&2) == 0) ? "짝수" : "홀수";
        System.out.println("입력한 숫자 "+a+"는"+ b+"입니다");
    }
}
