package com.karl.lk.algorithms.simple;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.BlockingQueue;

/**
 * @Description 整数反转
 * @Date 2021/6/4
 * @Author lk
 */
public class Reverse {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            result = result * 10 + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 123;
        final int res = new Reverse().reverse(x);
        System.out.println(res);
    }
}
