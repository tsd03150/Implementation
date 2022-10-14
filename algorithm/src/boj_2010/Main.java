package boj_2010;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = kb.nextInt();
            if (i == n - 1) {
                sum += num;
            } else {
                sum += num - 1;
            }
        }
        System.out.println(sum);
    }
}