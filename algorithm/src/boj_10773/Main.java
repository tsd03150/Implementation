package boj_10773;

import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        Stack<Integer> stack = new Stack<>();

        while (t-- > 0) {
            int num = kb.nextInt();
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        int answer = 0;
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        System.out.println(answer);
    }
}