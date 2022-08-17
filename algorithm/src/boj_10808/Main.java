package boj_10808;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] input = kb.next().toCharArray();
        int[] alpha = new int[26];
        for (int i = 0; i < input.length; i++) {
            alpha[input[i] - 'a']++;
        }
        for (int num : alpha) {
            System.out.print(num + " ");
        }
    }
}