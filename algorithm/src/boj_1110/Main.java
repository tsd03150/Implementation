package boj_1110;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int num = n;
        int answer = 0;

        while (true) {
            int a = num / 10;
            int b = num % 10;
            num = b * 10 + ((a + b) % 10);
            answer++;

            if (num == n) {
                System.out.println(answer);
                break;
            }
        }
    }
}