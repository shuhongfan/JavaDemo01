package com.shf.demo.leecode;

import java.util.Stack;

public class T232 {

}

class MyQueue {
    private static Stack<Integer> inStack;
    private static Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.empty();
    }

    private void in2out() {
        while (!inStack.empty()) {
            outStack.push(inStack.pop());
        }
    }

}