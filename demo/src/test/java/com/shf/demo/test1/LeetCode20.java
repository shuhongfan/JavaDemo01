package com.shf.demo.test1;

import java.util.LinkedList;

public class LeetCode20 {
    public boolean isValid(String s) {
        LinkedList<Character> memo = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                memo.push(s.charAt(i));
            } else {
                if (memo.size() == 0) {
                    return false;
                }

                Character pop = memo.pop();
                Character c = null;

                if (pop.equals('(')) {
                    c = ')';
                }

                if (pop.equals('{')) {
                    c = '}';
                }

                if (pop.equals('[')) {
                    c = ']';
                }

                if (!c.equals(s.charAt(i))) {
                    return false;
                }
            }
        }

        if (memo.size() != 0) {
            return false;
        }

        return true;
    }
}
