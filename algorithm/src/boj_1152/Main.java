package boj_1152;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        String[] split = str.split("\\s");
        int answer = 0;
        for (String s : split) {
            if (s.isBlank()) {
                continue;
            }
            answer++;
        }
        System.out.println(answer);
    }
}