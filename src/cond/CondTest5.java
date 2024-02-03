package cond;

public class CondTest5 {
    public static void main(String[] args) {
        String grade = "A";

        String speak = switch (grade){
            case "A" -> "굿굿굿";
            case "B" -> "흠흠흠";
            default -> "..";
        };
        System.out.println(speak);
    }
}
