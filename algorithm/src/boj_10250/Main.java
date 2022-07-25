package boj_10250;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        StringBuilder answer = new StringBuilder();

        while (t-- > 0) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            int n = kb.nextInt();

            int[][] arr = new int[h + 1][w + 1];
            for (int i = h; i > 0; i--) {
                int num = 100 * (h - i + 1);
                for (int j = 0; j < w; j++) {
                    arr[i][j] = ++num;
                }
            }
            int num = n / h;
            int dis = n % h;
            if (dis == 0) {
                answer.append(arr[1][num - 1] + "\n");
            } else {
                answer.append(arr[h - dis + 1][num] + "\n");
            }
        }
        System.out.println(answer);
    }
}