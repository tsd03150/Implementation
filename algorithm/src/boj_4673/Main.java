package boj_4673;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = Integer.parseInt(new StringBuilder(kb.next()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(kb.next()).reverse().toString());
        System.out.println(Math.max(a, b));
    }
}