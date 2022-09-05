package boj_2576;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum = 0;
        int min = 100;
        for (int i = 0; i < 7; i++) {
            int num = kb.nextInt();
            if (num % 2 != 0) {
                sum += num;
                min = Math.min(min, num);
            }
        }
        if (min == 100) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
