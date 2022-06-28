package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * problem: https://www.acmicpc.net/problem/10828
 */
public class Ex_10828 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final List<String> OPERATORS = new ArrayList<>();

    public static void main(String[] args) {
        int count = Integer.parseInt(SCANNER.nextLine());
        inputOperators(count);
        operate();
    }

    static void inputOperators(int number) {
        while (number > 0) {
            String operator = SCANNER.nextLine();
            OPERATORS.add(operator);
            number--;
        }
    }

    static void operate() {
        for (int i = 0; i < OPERATORS.size(); i++) {
            String str = OPERATORS.get(i);
            if ("push".equals(operator(str))) {
                operate(operator(str), operand(str));
                continue;
            }
            operate(operator(str), null);
        }
    }

    static String operator(String str) {
        return str.split(" ")[0];
    }

    static String operand(String str) {
        return str.split(" ")[1];
    }

    static void operate(String operator, String operand) {
        switch (operator) {
            case "push":
                CustomStack.push(operand);
                break;
            case "pop":
                System.out.println(CustomStack.pop());
                break;
            case "top":
                System.out.println(CustomStack.top());
                break;
            case "size":
                System.out.println(CustomStack.size());
                break;
            case "empty":
                System.out.println(CustomStack.empty());
                break;
            default:
        }
    }
}

class CustomStack {
    private static Stack STACK = new Stack();

    static void push(String number) {
        STACK.push(number);
    }

    static String pop() {
        return STACK.size() == 0 ? "-1" : (String) STACK.pop();
    }

    static String top() {
        return STACK.size() == 0 ? "-1" : (String) STACK.peek();
    }

    static Integer size() {
        return STACK.size();
    }

    static Integer empty() {
        return STACK.empty() == true ? 1 : 0;
    }

    public static Stack copy() {
        return (Stack) STACK.clone();
    }
}

