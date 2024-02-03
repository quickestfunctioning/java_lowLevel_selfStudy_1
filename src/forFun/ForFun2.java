package forFun;

public class ForFun2 {
    public static void main(String[] args) {
        String grade = "C";

        String talk = switch(grade){
            case "A" -> "베리나이스";
            case "B" -> "평범쓰";
            default -> "퇴학";
        };
        System.out.println(talk);
    }
}
