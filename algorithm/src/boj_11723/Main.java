package boj_11723;

import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        StringBuilder answer = new StringBuilder();
        int[] arr = new int[21];

        while (t-- > 0) {
            String str = kb.next();
            if (str.equals("all")) {
                Arrays.fill(arr, 1);
            } else if (str.equals("empty")) {
                Arrays.fill(arr, 0);
            } else {
                int n = kb.nextInt();
                if (str.equals("add")) {
                    arr[n] = 1;
                } else if (str.equals("remove")) {
                    arr[n] = 0;
                } else if (str.equals("check")) {
                    if (arr[n] == 1) {
                        answer.append(1 + "\n");
                    } else {
                        answer.append(0 + "\n");
                    }
                } else {
                    if (arr[n] == 0) {
                        arr[n] = 1;
                    } else {
                        arr[n] = 0;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}