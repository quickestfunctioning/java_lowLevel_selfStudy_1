package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int b=1; b<=9; b++){
            System.out.println(a+"*"+b+"="+a*b);
        }
    }
}
