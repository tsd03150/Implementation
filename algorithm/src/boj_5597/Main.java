package boj_5597;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[31];
        for (int i = 1; i <= 28; i++) {
            int num = kb.nextInt();
            arr[num]++;
        }
        for (int i = 1; i <= 30; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}