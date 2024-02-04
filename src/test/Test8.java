package test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;
        int b = 0 ;
        int sum = 0 ;

        while(true){
            a = input.nextInt();

            if (a==-1){
                break;
            }
            sum += a;
            b++;
        }

        double average = ((double)sum/b);

        System.out.println("입력한 숫자들의 합계: "+sum);
        System.out.println("입력한 숫자들의 평균: "+average);
    }
}
