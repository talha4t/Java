import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 89;
        marks[1] = 90;
        marks[2] = 85;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println("Array length is " + marks.length);

        // sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // boolean


        boolean mark[] = new boolean[3];

        System.out.println(mark[1]); // false
    }
}