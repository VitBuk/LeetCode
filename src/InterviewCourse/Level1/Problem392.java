package InterviewCourse.Level1;

import java.sql.SQLOutput;

public class Problem392 {
    /* Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
    public static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.equals("")) return true;

        int leftProgress =0;
        int rightProgress = s.length()-1;
        char leftChar=s.charAt(leftProgress);
        char rightChar=s.charAt(rightProgress);
        int leftPointer;
        int rightPointer;
        int amountOfFondedChars = 0;

        for (int i=0; i< (t.length()+1)/2; i++) {
            leftPointer = i;
            rightPointer = t.length()-1-i;
            if (leftChar == t.charAt(leftPointer)) {
                amountOfFondedChars++;
                if (amountOfFondedChars == s.length()) return true;
                leftProgress++;
                leftChar = s.charAt(leftProgress);
            }

            if (leftPointer == rightPointer) return false;

            if (rightChar == t.charAt(rightPointer)){
                amountOfFondedChars++;
                if (amountOfFondedChars == s.length()) return true;
                rightProgress--;
                rightChar=s.charAt(rightProgress);
            }
        }

        return false;

    }
}
