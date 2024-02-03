package operator;

public class Operator2 {
    public static void main(String[] args) {
        System.out.println("hello"+"world");

        String result1="a+b="+10; // 이 때 string이기 때문에 10도 자바에서 문자로 바꿔버림
        System.out.println(result1);

        String str = "a+b=";
        int num=20;
        System.out.println(str+num); // 변수값 조회 후 더할 때 숫자를 문자열로 바꾸고 더함
    }
}
