package boj_2845;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int total = n * m;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int num = kb.nextInt();
            answer.append(num - total + " ");
        }
        System.out.println(answer);
    }
}