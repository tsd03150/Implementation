package boj_1009;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        StringBuilder answer = new StringBuilder();
        while (t-- > 0) {
            int n = kb.nextInt();
            int m = kb.nextInt();
            int[] arr = new int[5];
            for (int i = 1; i <= 4; i++) {
                int c = (int) Math.pow(n, i) % 10;
                if (c == 0) {
                    arr[i] = 10;
                } else {
                    arr[i] = c;
                }
            }
            if (m % 4 == 0) {
                answer.append(arr[4] + "\n");
            } else {
                answer.append(arr[m % 4] + "\n");
            }
        }
        System.out.println(answer);
    }
}