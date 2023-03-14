package leetCode.list.day07.N383;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/7 9:35
 */

public class Solution_2 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int arr[] = new int[26];
        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            arr[c - 'a']--;
            if (arr[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "aa";
        String str2 = "aba";

        System.out.println(canConstruct(str1, str2));
    }

}
