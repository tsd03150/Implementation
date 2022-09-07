package boj_1977;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= 100; i++) {
            int tmp = i * i;
            if (m <= tmp && tmp <= n) {
                min = Math.min(min, tmp);
                sum += tmp;
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}