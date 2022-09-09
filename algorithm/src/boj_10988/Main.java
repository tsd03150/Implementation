package boj_10988;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}