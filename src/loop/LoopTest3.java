package loop;

public class LoopTest3 {
    public static void main(String[] args) {
        int rows = 5;

        for (int rows2=1; rows2<=rows; rows2++  ) {

            for (int j = 1; j <= rows2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
