package com.karl.lk.algorithms.simple;

/**
 * @Description 回文数
 * @Date 2021/6/5
 * @Author lk
 */
public class Palindrome {
    /**
     * 反转数字之后跟原数字比较.
     **/
    public boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }
        int result = 0;
        int temp = x;
        while (temp != 0) {
            if (result < Integer.MIN_VALUE/ 10 || result > Integer.MAX_VALUE / 10) {
                return  false;
            }
            int digits = temp % 10;
            temp /= 10;
            result = result * 10 + digits;
        }
        return result == x;
    }

    /**
     * 进阶！
     * 反转一半数字.
     **/
    public boolean isPalindrome2(int x) {
        if (x < 0 || x % 10 ==0 && x != 0) {
            return false;
        }
        int result = 0;
        while (x > result) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return x == result || x == result / 10;
    }

    /**
     * 装成字符串比较.
     **/
    public boolean isPalindrome3(int x) {
        String s = String.valueOf(x);
        boolean flag = true;
        for (int i = 0; i < s.length() / 2 ; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int x = 123;
        final boolean palindrome = new Palindrome().isPalindrome3(x);
        System.out.println(palindrome);
    }
}
