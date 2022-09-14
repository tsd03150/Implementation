package boj_4101;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        while (true) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            if (a == 0 && b == 0) {
                System.out.println(answer);
                break;
            }
            if (a > b) {
                answer.append("Yes" + "\n");
            } else {
                answer.append("No" + "\n");
            }
        }
    }
}