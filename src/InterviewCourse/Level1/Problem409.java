package InterviewCourse.Level1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem409 {
    public static int longestPalindrome(String s) {
        Map<Character, Integer> palindromMap = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            if (!palindromMap.containsKey(s.charAt(i)))
                palindromMap.put(s.charAt(i), 1);
             else
                palindromMap.replace(s.charAt(i), palindromMap.get(s.charAt(i)) + 1);
        }
        int palindromLength = 0;
        List<Integer> values = palindromMap.values().stream().collect(Collectors.toList());
        if (values.size() == 1)
            return values.get(0);

        int firstOdd = 0;

        for (int value : values) {
            if (value % 2 == 0)
                palindromLength += value;
            if (value % 2 == 1) {
                if (firstOdd == 0) {
                    firstOdd = value;
                    palindromLength += firstOdd;
                } else {
                    palindromLength += value - 1;
                }
            }
        }

        return palindromLength;
    }
}
