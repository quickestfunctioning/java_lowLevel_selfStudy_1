package loop;

public class While2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int end = 12;

        while(b<=end){
            a = a+b;
            System.out.println(a);
            b++;
        }
    }
}
