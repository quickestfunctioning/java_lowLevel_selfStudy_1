package loop;

public class While3 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=6){
            if(i==3 || i==4){
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
