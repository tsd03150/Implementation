package boj_2442;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = n - 1 - i; k <= n - 1 + i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}