package array;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 80, 60, 50, 40};
        int total = 0;

        for(int i = 0; i<students.length; i++){
            total += students[i];
        }

        double average = (double) total / students.length;
        System.out.println(total);
        System.out.println(average);
    }
}
