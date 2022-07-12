package boj_8958;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        StringBuilder answer = new StringBuilder();
        while (t-- > 0) {
            char[] c = kb.next().toCharArray();
            int total = 0;
            int sum = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == 'O') {
                    sum++;
                } else {
                    sum = 0;
                }
                total += sum;
            }
            answer.append(total + "\n");
        }
        System.out.println(answer);
    }
}