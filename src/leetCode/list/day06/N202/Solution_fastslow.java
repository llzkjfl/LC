package leetCode.list.day06.N202;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/6 17:23
 */

public class Solution_fastslow {
    public static boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            fast = getNextNumber(getNextNumber(fast));
            slow = getNextNumber(slow);
        } while (fast != slow);
        return slow == 1;
    }

    private static int getNextNumber(int n) {

        int res = 0;
        while (n > 0) {
            int pow = n % 10;
            res += pow * pow;
            n /= 10;
        }
        res += n * n;

        return res;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(32));
    }

}
