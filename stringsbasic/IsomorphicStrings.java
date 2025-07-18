package stringsbasic;

import java.util.*;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println("Is Isomorphic: " + isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i), c2 = t.charAt(i);

            if ((map1.containsKey(c1) && map1.get(c1) != c2) ||
                (map2.containsKey(c2) && map2.get(c2) != c1)) {
                return false;
            }

            map1.put(c1, c2);
            map2.put(c2, c1);
        }

        return true;
    }
}
