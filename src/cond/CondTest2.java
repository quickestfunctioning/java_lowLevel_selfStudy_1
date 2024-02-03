package cond;

public class CondTest2 {
    public static void main(String[] args) {
        int distance = 60;
        if (distance<=1){
            System.out.println("걸으세요");
        } else if (distance<=10){
            System.out.println("뛰세요");
        } else {
            System.out.println("대중교통");
        }
    }
}
