import java.util.HashSet;

/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

    - Starting with any positive integer, replace the number by the sum of the squares of its digits.
    - Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle
        which does not include 1.
    - Those numbers for which this process ends in 1 are happy.
    - Return 1 if n is a happy number, and 0 if not.

    Input: n = 19
    Output: 1
    Number 19 is Happy Number because:
    1^2 + 9^2 = 82
    8^2 + 2^2 = 68
    6^2 + 8^2 = 100
    1^2 + 0^2 + 0^2 = 1
    As we reached to 1, 19 is a Happy Number return 1
    Otherwise return 0.*/

public class HappyNum {
    public static void main(String[] args) {
        int num = 22;
        if (isHappyNum(num)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }

    static boolean isHappyNum(int num) {
        HashSet<Integer> st = new HashSet<>();
        while (true) {
            num = numSquaresSum(num);
            if (num ==1) {
                return true;
            }
            if (st.contains(num)) {
                return false;
            }
            st.add(num);
        }
    }

    static int numSquaresSum(int num) {
        int squareSum = 0;
        while (num != 0) {
            squareSum += (num % 10) * (num % 10);
            num /= 10;
        }
        return  squareSum;
    }
}
