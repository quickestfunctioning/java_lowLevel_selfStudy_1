package method;

public class Method1 {
    public static void main(String[] args) {
        int good = odd(4);
        System.out.println(good);
    }

    public static int odd(int i) {
        if(i/2 == 1){
            return 1;
        }
        else{
            System.out.println("굿");
            return 0;
        }
    }
}
