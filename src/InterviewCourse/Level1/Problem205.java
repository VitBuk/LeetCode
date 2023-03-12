package InterviewCourse.Level1;

import java.util.HashMap;

public class Problem205 {
    /*Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced
with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.*/
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> charMap = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            if (!charMap.containsKey(s.charAt(i)) && !charMap.containsValue(t.charAt(i)))
                charMap.put(s.charAt(i),t.charAt(i));
        }

        StringBuilder mappedS = new StringBuilder();
        for (int i=0; i<s.length(); i++)
            mappedS.append(charMap.get(s.charAt(i)));

        return mappedS.toString().equals(t);
    }

}
