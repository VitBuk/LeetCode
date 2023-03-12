import InterviewCourse.Level1.Problem1480;
import InterviewCourse.Level1.Problem205;
import InterviewCourse.Level1.Problem724;

public class Main {
    public static void main(String[] args) {

        String s = "aabb";
        String t = "ccdd";
        String s2 = "abcdeee";
        String t2 = "zxydfff";
        String s3 = "abb";
        String t3 = "abc";

        System.out.println(Problem205.isIsomorphic(s,t));
        System.out.println(Problem205.isIsomorphic(s2,t2));
        System.out.println(Problem205.isIsomorphic(s3,t3));

    }
}