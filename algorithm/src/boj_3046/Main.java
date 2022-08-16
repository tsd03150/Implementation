package boj_3046;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int r1 = kb.nextInt();
        int s = kb.nextInt();
        System.out.println(s * 2 - r1);
    }
}
