package cond;

public class CondOp {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("나이가 " + age + " 현재 " + status);
    }
}
