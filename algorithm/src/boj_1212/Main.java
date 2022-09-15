package boj_1212;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] arr = kb.next().toCharArray();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            String tmp = Integer.toBinaryString(arr[i] - '0');
            if (i == 0) {
                answer.append(tmp);
            } else {
                if (tmp.length() == 1) {
                    answer.append("00" + tmp);
                } else if (tmp.length() == 2) {
                    answer.append("0" + tmp);
                } else {
                    answer.append(tmp);
                }
            }
        }
        System.out.println(answer);
    }
}