package cond;

public class CondTest1 {
    public static void main(String[] args) {
        int grade = 70;
        String score;

        if(grade>=90){
            score = "A";
            System.out.println("score : "+grade+"출력: 학점은"+score);
        } else if(grade>=80){
            score = "B";
            System.out.println("socre : "+grade+"출력: 학점은"+score);
        } else
            System.out.println("낙제");
    }
}
