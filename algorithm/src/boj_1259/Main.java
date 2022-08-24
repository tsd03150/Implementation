package boj_1259;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        while (true) {
            String str = kb.next();
            if (str.equals("0")) {
                break;
            }
            String tmp = new StringBuilder(str).reverse().toString();
            if (str.equals(tmp)) {
                answer.append("yes" + "\n");
            } else {
                answer.append("no" + "\n");
            }
        }
        System.out.println(answer);
    }
}
