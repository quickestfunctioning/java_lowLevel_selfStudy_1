package array;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        int k = input.nextInt();
        int[] plus = new int[k];

        System.out.println(k+"개의 정수를 입력하세요");

        for (int i=0; i< plus.length; i++ ){
            plus[i] = input.nextInt();
        }

        int min, max;

        min = max = plus[0];

        for (int i = 1; i<plus.length; i++){
            if (plus[i]>max){
                max = plus[i];
            }
            if (plus[i]<min){
                min = plus[i];
            }
        }
        System.out.println(min+", 그리고 "+max);
    }
}
