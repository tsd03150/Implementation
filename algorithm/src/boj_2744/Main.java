package boj_2744;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] arr = kb.next().toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (65 <= arr[i] && arr[i] <= 90) {
                answer.append((char) (arr[i] + 32));
            } else {
                answer.append((char) (arr[i] - 32));
            }
        }
        System.out.println(answer);
    }
}