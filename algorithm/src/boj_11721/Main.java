package boj_11721;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        while (true) {
            if (str.length() > 10) {
                System.out.println(str.substring(0, 10));
                str = str.substring(10);
            } else {
                System.out.println(str);
                break;
            }
        }
    }
}
