package method;

public class MethodTest2 {
    public static void main(String[] args) {
        call(1);
        call(3);
        call(5);
    }
    public static void call(int a){
        String message = "Hello,world!";
        for (int i=0; i<a; i++){
            System.out.println(message);
        }
    }
}
