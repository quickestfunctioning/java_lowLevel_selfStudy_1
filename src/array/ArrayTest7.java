package array;

import java.util.Scanner;

public class ArrayTest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] spot = new int[4][3];
        String[] text = {"국어", "영어", "수학"};

        for (int i = 0; i<spot.length; i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요: ");
            for (int j=0; j<spot[i].length; j++){
                System.out.print(text[j]+" 점수: ");
                spot[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i<spot.length; i++){

            int total=0;
            int average=0;

            for(int j=0; j<spot[i].length; j++){
                total += spot[i][j];
                average = total/spot[i].length;
            }
            System.out.println((i+1)+"번 학생의 총점: "+total+", 평균: "+average);
        }
    }
}
