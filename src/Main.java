import InterviewCourse.Level1.Problem1480;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] result = Problem1480.runningSum(array);

        for (int i=0; i<array.length; i++) {
            System.out.println(result[i]);
        }
    }
}