package boj_9093;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        StringBuilder answer = new StringBuilder();
        kb.nextLine();

        while (t-- > 0) {
            String str = kb.nextLine();
            String[] arr = str.split(" ");
            for (String tmp : arr) {
                answer.append(new StringBuilder(tmp).reverse() + " ");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}