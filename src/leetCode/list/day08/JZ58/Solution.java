package leetCode.list.day08.JZ58;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/9 0:24
 */

public class Solution {
    public static String reverseLeftWords(String s, int n) {
        //abcdefg --->cbagfed---> defgabc


        char[] chars = s.toCharArray();
        int len= chars.length;
        chars = reverse(chars,0,n-1);
        chars = reverse(chars,n,len-1);
        chars = reverse(chars,0,len-1);

//        return  new String(reverse(reverse(reverse(s.toCharArray(),0,n-1),n,len-1),0,len-1));
        return new String(chars);
    }



    public static char[] reverse(char c[],int i,int j){
        char tmp;
        System.out.println(c.length);
        while(i<j){
            tmp=c[i];
            c[i] = c[j];
            c[j] = tmp;
            i++;
            j--;
        }
        return c;
    }

    public static void main(String[] args) {
        String str ="abcdefg";
        System.out.println(reverseLeftWords(str,3));
    }





}
