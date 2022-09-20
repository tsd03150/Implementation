package boj_25304;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += kb.nextInt() * kb.nextInt();
        }
        if (m == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}