package boj_11719;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();

        while (kb.hasNextLine()) {
            String str = kb.nextLine();
            answer.append(str + "\n");
        }
        System.out.println(answer);
    }
}