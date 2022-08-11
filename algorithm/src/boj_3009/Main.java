package boj_3009;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] graphX = new int[1001];
        int[] graphY = new int[1001];

        for (int i = 0; i < 3; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graphX[a]++;
            graphY[b]++;
        }

        for (int i = 0; i <= 1000; i++) {
            if (graphX[i] % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        for (int i = 0; i <= 1000; i++) {
            if (graphY[i] % 2 != 0) {
                System.out.print(i);
            }
        }
    }
}
