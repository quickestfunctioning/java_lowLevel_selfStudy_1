package test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        scanner.nextLine();
        int num2 = scanner.nextInt();
        scanner.nextLine();
        int num3 = 0;

        if (num1>num2){
            num3 = num1;
            num1 = num2;
            num2 = num3;
        }

            while (num1 < (num2 - 1)) {
                num1++;
                System.out.print(num1);
                if (num1 == (num2 - 1)) {
                    break;
                }
                System.out.print(", ");
            }
        }
}
