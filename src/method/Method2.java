package method;

public class Method2 {
    public static void main(String[] args) {
        checkAge(20);
    }
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");

        }else if (age==19) {
            System.out.println(age + "살, 입장하세요.");
        }
    }
}
