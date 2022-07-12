package boj_2675;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        StringBuilder answer = new StringBuilder();

        while (t-- > 0) {
            int m = kb.nextInt();
            char[] arr = kb.nextLine().trim().toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < m; j++) {
                    answer.append(arr[i]);
                }
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}