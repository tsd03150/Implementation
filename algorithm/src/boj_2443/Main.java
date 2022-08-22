package boj_2443;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            int j = 0;
            for (; j < i; j++) {
                System.out.print(" ");
            }
            for (; j < n * 2 - 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}