package boj_2475;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = kb.nextInt();
            sum += num * num;
        }
        System.out.println(sum % 10);
    }
}