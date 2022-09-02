package boj_1032;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        StringBuilder answer = new StringBuilder();
        char[][] arr = new char[n][];
        for (int i = 0; i < n; i++) {
            String s = kb.next();
            arr[i] = new char[s.length()];
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        char[] c = arr[0];
        for (int i = 0; i < c.length; i++) {
            int cnt = 1;
            for (int j = 1; j < arr.length; j++) {
                if (c[i] == arr[j][i]) {
                    cnt++;
                }
            }
            if (cnt == n) {
                answer.append(c[i]);
            } else {
                answer.append("?");
            }
        }
        System.out.println(answer);
    }
}