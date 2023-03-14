package leetCode.list.day06.N242;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/6 9:33
 */

public class Solution {
    public static void main(String[] args) {
        String s = "aacc";
        String t = "caca";
       System.out.println(isAnagram(s,t));

    }
//a97
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int cnt[] = new int[26];
        for(int i=0;i< s.length();i++){
            cnt[s.charAt(i)-97]++;
            cnt[t.charAt(i)-97]--;
        }
        for(int i=0;i< cnt.length;i++){
            if(cnt[i]!=0){
                return false;
            }
        }

        return true;


    }
}
