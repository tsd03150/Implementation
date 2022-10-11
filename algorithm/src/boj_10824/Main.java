package boj_10824;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        String c = kb.next();
        String d = kb.next();
        System.out.println(Long.parseLong(a + b) + Long.parseLong(c + d));
    }
}