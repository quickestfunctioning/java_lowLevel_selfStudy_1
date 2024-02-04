package array;

import java.util.Scanner;

public class ArrayTest5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int j = input.nextInt();
        int[] top = new int[j];
        int sum = 0 ;

        for (int i = 0; i<top.length; i++){
            top[i] = input.nextInt();
            sum += top[i];
        }
        double average = ((double)sum / top.length);

        System.out.println("합은 "+sum+", "+"평균은 "+average);
    }
}

