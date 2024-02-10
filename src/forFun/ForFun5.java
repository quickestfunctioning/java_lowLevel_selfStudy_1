package forFun;

import java.util.Scanner;

public class ForFun5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 0;
//        double average = (double)sum / n ;

        while (true) {
            double average = (double)sum / n ;
            int a = sc.nextInt();
            if (a == -1) {
                System.out.println(sum + ", " + average);
            }
            sum += a;
            n++;
//            average = (double)sum / n ;
        }
    }
}
