package array;

public class Array1 {
    public static void main(String[] args) {

//        int[] students = new int[];
        int[] students = {90, 80, 70, 60, 50};

        for(int i=0; i<students.length; i++){
            System.out.println("학생"+ (i+1)+"의 점수는 "+students[i]);
        }
    }
}
