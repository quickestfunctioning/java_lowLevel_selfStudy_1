package test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            int price = input.nextInt();
            if (price == -1){
                System.out.println("그만");
                break;
            }
            int quantity = input.nextInt();
            int total = price * quantity;

            System.out.println("총 비용: " + total);
        }
    }
}
