package array;

import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bot = new int[5];

        for (int i = 0; i< bot.length; i++){
            bot[i] = scanner.nextInt();
        }
        for (int i = (bot.length-1); i>=0; i--){
            System.out.print(bot[i]);
            if(i==0){
                break;
            }
            System.out.print(", ");
        }
    }
}
