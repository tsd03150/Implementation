package boj_2523;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = n * 2 - 1;
        for (int i = 0; i < k; i++) {
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < k - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
