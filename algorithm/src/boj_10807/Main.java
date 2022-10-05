package boj_10807;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}