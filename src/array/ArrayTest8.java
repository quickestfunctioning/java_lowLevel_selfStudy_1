package array;

import java.util.Scanner;

public class ArrayTest8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] goods = new String[10];

        int n = 0;


        while (true) {
            System.out.println("1.상품등록, 2.상품목록, 3.종료 중에 선택하세요");
            int i = scanner.nextInt();

            if (i == 1) {

                if (n == 10) {
                    System.out.println("더 이상 상품등록은 불가합니다");
                    continue;
                }

                System.out.print("상품을 등록하세요: ");
                scanner.nextLine();
                goods[n] = scanner.nextLine();
                n++;
            }
            if (i == 2) {
                System.out.println("상품 목록: ");
                for(int j=0; j<n; j++){
                    System.out.println(goods[j]);
                }
            }

            if (i == 3) {
                System.out.println("종료");
                break;
            }
        }
    }
}
