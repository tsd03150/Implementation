package boj_2953;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += kb.nextInt();
            }
            if (sum > max) {
                max = sum;
                idx = i + 1;
            }
        }
        System.out.println(idx + " " + max);
    }
}