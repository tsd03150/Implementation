package boj_1157;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] ch = kb.next().toUpperCase().toCharArray();
        int[] alpha = new int[26];
        int max = Integer.MIN_VALUE;
        char answer = 0;
        int idx = 0;
        for (int i = 0; i < ch.length; i++) {
            alpha[ch[i] - 'A']++;
            if (max < alpha[ch[i] - 'A']) {
                max = alpha[ch[i] - 'A'];
                idx = ch[i] - 'A';
                answer = ch[i];
            }
        }
        for (int i = 0; i < 26; i++) {
            if (i == idx) {
                continue;
            }
            if (alpha[i] == max) {
                System.out.println("?");
                System.exit(0);
            }
        }
        System.out.println(answer);
    }
}