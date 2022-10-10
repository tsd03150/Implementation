package boj_11655;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] ch = kb.nextLine().toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLowerCase(ch[i])) {
                if (ch[i] + 13 <= 122) {
                    answer.append((char) (ch[i] + 13));
                } else {
                    answer.append((char) (ch[i] - 13));
                }
            } else if (Character.isUpperCase(ch[i])) {
                if (ch[i] + 13 <= 90) {
                    answer.append((char) (ch[i] + 13));
                } else {
                    answer.append((char) (ch[i] - 13));
                }
            } else {
                answer.append(ch[i]);
            }
        }
        System.out.println(answer);
    }
}