package method;

public class MethodTest1 {
    public static void main(String[] args) {
        calc(1, 2, 3);
        calc(15, 25, 35);
    }

    public static void calc(int a, int b, int c){
            int sum = a + b + c;
            double average = sum / 3.0;
            System.out.println("평균값: " + average);
        }
}
