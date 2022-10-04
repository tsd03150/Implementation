package boj_10992;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print("*");
            } else if (i == n - 1) {
                for (int k = 0; k < n + (n - 1); k++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int l = 0; l < i * 2 - 1; l++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}