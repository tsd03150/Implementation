package boj_5565;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum = kb.nextInt();
        for (int i = 0; i < 9; i++) {
            sum -= kb.nextInt();
        }
        System.out.println(sum);
    }
}