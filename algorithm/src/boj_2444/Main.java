package boj_2444;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = n * 2 - 1;
        for (int i = 0; i < n; i++) {
            int j = 0;
            for (; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (; j <= k / 2 + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            int j = 0;
            for (; j <= i; j++) {
                System.out.print(" ");
            }
            for (; j < k - 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}