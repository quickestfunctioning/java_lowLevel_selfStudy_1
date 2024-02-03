package loop;

import java.sql.SQLOutput;

public class For1 {
    public static void main(String[] args) {
        for (int i =0; i<2; i++){
            System.out.println("외부 for 시작 i:" + i);
            for (int j=0; j<3; j++){
                System.out.println("->내부for" + i + j);
                System.out.println("종료"+i);
                System.out.println();
            }
        }
    }
}
