package boj_2902;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] arr = kb.next().toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (65 <= arr[i] && arr[i] <= 90) {
                answer.append(arr[i]);
            }
        }
        System.out.println(answer);
    }
}