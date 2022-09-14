package boj_1212;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] c = kb.next().toCharArray();
        StringBuilder answer = new StringBuilder();

        if (c.length == 1) {
            System.out.println(c);
        } else {
            for (int i = 0; i < c.length; i++) {
                int num = c[i] - '0';
                String tmp = Integer.toBinaryString(num);
                if (tmp.length() == 1) {
                    answer.append("00" + tmp);
                } else if (tmp.length() == 2) {
                    answer.append("0" + tmp);
                } else {
                    answer.append(tmp);
                }
            }
            if (answer.toString().toCharArray()[0] == 48) {
                System.out.println(answer.substring(1));
            } else {
                System.out.println(answer);
            }
        }
    }
}