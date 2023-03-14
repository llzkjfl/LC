package leetCode.list.day07.N383;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/7 9:01
 */

public class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();
        char s1[] = magazine.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            if (map.containsKey(s1[i])) {
                map.put(s1[i], map.get(s1[i]) + 1);
            } else {
                map.put(s1[i], 1);
            }
        }
        char s2[] = ransomNote.toCharArray();
        for (int i = 0; i < s2.length; i++) {
            if (!map.containsKey(s2[i])) {
                return false;
            } else if (map.get(s2[i]) == 0) {
                return false;
            } else {
                map.put(s2[i], map.get(s2[i]) - 1);
            }
        }

        return true;
    }


//    public static void main(String[] args) {
//        String str1 = "aa";
//        String str2 = "ab";
//
//        System.out.println(canConstruct(str1, str2));
//    }
}
