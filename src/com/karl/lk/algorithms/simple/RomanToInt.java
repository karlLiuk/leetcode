package com.karl.lk.algorithms.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 罗马数字转整数
 * @Date 2021/6/6
 * @Author lk
 */
public class RomanToInt {
    private Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int value = symbolValues.get(s.charAt(i));
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "III";
        final int romanToInt = new RomanToInt().romanToInt(s);
        System.out.println(romanToInt);
    }
}
