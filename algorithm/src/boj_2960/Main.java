package boj_2960;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n + 1];
        int idx = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                if (arr[j] == 0) {
                    arr[j] = idx++;
                    if (arr[j] == k) {
                        System.out.println(j);
                        System.exit(0);
                    }
                }
            }
        }
    }
}