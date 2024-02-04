package test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 이름을 입력하세요");
        String name = scanner.nextLine();

        System.out.println(name);
    }
}

